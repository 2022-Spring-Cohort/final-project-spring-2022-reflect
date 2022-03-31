const menu = document.querySelector(".menu");
const menuItems = document.querySelectorAll(".nav-links");
const hamburger = document.querySelector(".hamburger");
const closeIcon = document.querySelector(".closeIcon");
const menuIcon = document.querySelector(".menuIcon");

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

 
const quote = document.querySelector('inspo-quote');

const api_url = "https://zenquotes.io/api/random/";

async function getapi(url) {
    const response = await fetch(url);
    var data = await response.json();
    console.log(data);
    quoteNew = JSON.parse(data);
    
}
getapi(api_url);
quote.innerHTML = (quoteNew);




hamburger.addEventListener("click", toggleMenu);
