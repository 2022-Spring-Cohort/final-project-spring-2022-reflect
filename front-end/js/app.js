import userView from "./users.js";
import home from "./home.js";
import header from "./header.js";




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

    
}



