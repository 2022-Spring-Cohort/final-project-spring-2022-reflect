import userView from "./users.js";
import home from "./home.js";
import header from "./header.js";
import meditate from "./meditate.js";




const containerEl = document.querySelector(".container");

function makeUserListView() {
    fetch("http://localhost:8080/users")
    .then(res => res.json())
    .then(users => {
        makeUserListViewFromJSON(users);
    })
}

function makeUserListViewFromJSON(users) {
    console.log(users);
    containerEl.innerHTML = userView(users);

    const usersEl = document.querySelectorAll(".userInfo");

    usersEl.forEach(user => {
        let userIdEl = user.querySelector(".id_field");
        const userName = user.querySelector(".user-name");
        userName.addEventListener("click", () => {
            users.forEach(userJson => {
                if (userJson.id == userIdEl.value) {
                    makeUserView(userJson);
                }
            })
        })
    }) 

}

makeUserListView();


function makeUserView(user) {
    console.log(user);
    containerEl.innerHTML = header();
    containerEl.innerHTML += home(user);


    // hamburger menu
    const menu = document.querySelector(".menu");
    const menuItems = document.querySelectorAll(".nav-links");
    const hamburger = document.querySelector(".hamburger");
    const closeIcon = document.querySelector(".close-icon");
    const menuIcon = document.querySelector(".menu-icon");
    hamburger.addEventListener("click", toggleMenu);

    function toggleMenu() {
        if (menu.classList.contains("showMenu")) {
            menu.classList.remove("showMenu");
            closeIcon.style.display = "none";
            menuIcon.style.display = "block";
        } else {
            menu.classList.add("showMenu");
            closeIcon.style.display = "block";
            menuIcon.style.display = "none";
        }
    }
    menuItems.forEach(
        function (menuItem) {
            menuItem.addEventListener("click", toggleMenu);
        }
    )
    

    // quote generator
    const inspoQuote = document.querySelector(".inspo-quote");
    const inspoAuthor = document.querySelector(".inspo-author");

    fetch(`https://zenquotes.io/api/random/32bcf235078efe18922329c8829e0c88e4a2098a`)
    .then(res => res.json())
    .then(jsonData => {

        inspoQuote.innerText = jsonData[0].q;
        inspoAuthor.innerText = "-" + jsonData[0].a;

    })

    
}

function makeMeditationView() {
    console.log(user);
    containerEl.innerHTML = header();
    containerEl.innerHTML += meditate();
}



