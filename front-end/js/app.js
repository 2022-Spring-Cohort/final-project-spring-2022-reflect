import userView from "./users.js";
import home from "./home.js";
import header from "./header.js";
import meditate from "./meditate.js";
import playAmbient from "./audio.js";
import categoryView from "./category.js";
import progressView from "./progress.js";
import aboutView from "./about.js";
import makeTimer from "./timer.js";
import timerSelectView from "./timerSelect.js";


const containerEl = document.querySelector(".container");


function makeUserListView() {
    fetch("http://localhost:8080/users")
    .then(res => res.json())
    .then(users => {
        makeUserListViewFromJSON(users);
    })
}

function makeUserListViewFromJSON(users) {
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

    const newName = containerEl.querySelector(".newUser-name")
    const newUserButton = containerEl.querySelector(".newUser-button");
    newUserButton.addEventListener("click", () => {
        const newUserJson = {

            "name": newName.value,
            
        }

        fetch(`http://localhost:8080/users/addUser`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(newUserJson),
        })
        .then(res => res.json())
        .then(newUsers => {
            makeUserListViewFromJSON(newUsers);
        })
    })
}

makeUserListView();


function toggleMenu() {
    const menu = document.querySelector(".menu");
    const closeIcon = document.querySelector(".x-icon");
    const menuIcon = document.querySelector(".menu-icon");

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

function makeHamburgerMenu(user) {

    const menu = document.querySelector(".menu");
    const menuItems = document.querySelectorAll(".nav-links");
    const hamburger = document.querySelector(".hamburger");
    const closeIcon = document.querySelector(".x-icon");
    const menuIcon = document.querySelector(".menu-icon");
    const homeLink = document.querySelector(".homeLink")
    const meditate = document.querySelector(".meditate")
    const progressLink = document.querySelector(".progressLink")
    const categories = document.querySelector(".categories")
    const aboutLink = document.querySelector(".aboutLink")

    aboutLink.addEventListener("click", () => {
        makeAboutView(user);
    })
    progressLink.addEventListener("click", () => {
        makeProgressView(user);
    })
    categories.addEventListener("click", () => {
        makeCategoriesView(user);
    })
    homeLink.addEventListener("click", () => {
        makeUserView(user);
    })
    hamburger.addEventListener("click", toggleMenu);
    meditate.addEventListener("click", () => {
        makeTimerSelectView(user);
    });

    closeIcon.addEventListener("click", toggleMenu);
}


function makeUserView(user) {
    containerEl.innerHTML = header();
    containerEl.innerHTML += home(user);


    makeHamburgerMenu(user);

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

let meditationIncrements = [5, 10, 15, 20, 30]

function makeMeditationView(user, increment) {

    
    containerEl.innerHTML = header();
    containerEl.innerHTML += meditate();

    makeHamburgerMenu(user);

    makeTimer(increment);

    // // 10 minutes from now
    // var time_in_minutes = 10;
    // var current_time = Date.parse(new Date());
    // var deadline = new Date(current_time + time_in_minutes*60*1000);


    // function time_remaining(endtime){
    //     var t = Date.parse(endtime) - Date.parse(new Date());
    //     var seconds = Math.floor( (t/1000) % 60 );
    //     var minutes = Math.floor( (t/1000/60) % 60 );
    //     var hours = Math.floor( (t/(1000*60*60)) % 24 );
    //     var days = Math.floor( t/(1000*60*60*24) );
    //     return {'total':t, 'days':days, 'hours':hours, 'minutes':minutes, 'seconds':seconds};
    // }

    // var timeinterval;
    // function run_clock(id,endtime){
    //     var clock = document.getElementById(id);
    //     function update_clock(){
    //         var t = time_remaining(endtime);
    //         clock.innerHTML = t.minutes + ':' + t.seconds;
    //         if(t.total<=0){ clearInterval(timeinterval); }
    //     }
    //     update_clock(); // run function once at first to avoid delay
    //     timeinterval = setInterval(update_clock,1000);
    // }
    // run_clock('clockdiv',deadline);


    // var paused = false; // is the clock paused?
    // var time_left; // time left on the clock when paused

    // function pause_clock(){
    //     if(!paused){
    //         paused = true;
    //         clearInterval(timeinterval); // stop the clock
    //         time_left = time_remaining(deadline).total; // preserve remaining time
    //     }
    // }

    // pause_clock();

    // function resume_clock(){
    //     if(paused){
    //         paused = false;

    //         // update the deadline to preserve the amount of time remaining
    //         deadline = new Date(Date.parse(new Date()) + time_left);

    //         // start the clock
    //         run_clock('clockdiv',deadline);
    //     }
    // }

    // // handle pause and resume button clicks
    // const playButton = document.querySelector(".play-button");
    // playButton.addEventListener("click", ()=> {
    //     resume_clock();
    //     const audioEl = document.querySelector(".audio");
    //     audioEl.innerHTML += playAmbient();
    // })

    // const pauseButton = document.querySelector(".pause-button");
    // pauseButton.addEventListener("click", ()=> {
    //     pause_clock();
    // })


    
}

function makeProgressView(user) {
    containerEl.innerHTML = header();
    containerEl.innerHTML += progressView();

    makeHamburgerMenu(user);
}

function makeCategoriesView(user){
    
    containerEl.innerHTML = header();
    containerEl.innerHTML += categoryView();

    makeHamburgerMenu(user);



}

function makeAboutView(user) {
    containerEl.innerHTML = header();
    containerEl.innerHTML += aboutView();

    makeHamburgerMenu(user);
}

function makeTimerSelectView(user) {
    containerEl.innerHTML = header();
    containerEl.innerHTML += timerSelectView(meditationIncrements);

    makeHamburgerMenu(user);

    const incrementChoices = document.querySelectorAll(".increment-container")
    incrementChoices.forEach(increment => {
        increment.addEventListener("click", ()=> {
            const incrementID = increment.querySelector(".increment-id");
            makeMeditationView(user, incrementID.value)
        })
    })
    
}


