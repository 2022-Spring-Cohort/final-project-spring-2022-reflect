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

import mindsetView from "./mindsetWhyView";

import topicView from "./topicView.js";



const containerEl = document.querySelector(".container");

function makeUserListView() {
  fetch("http://localhost:8080/users")
    .then((res) => res.json())
    .then((users) => {
      makeUserListViewFromJSON(users);
    });
}

function makeUserListViewFromJSON(users) {
  containerEl.innerHTML = userView(users);

  const usersEl = document.querySelectorAll(".userInfo");

  usersEl.forEach((user) => {
    let userIdEl = user.querySelector(".id_field");
    const userName = user.querySelector(".user-name");
    userName.addEventListener("click", () => {
      users.forEach((userJson) => {
        if (userJson.id == userIdEl.value) {
          makeUserView(userJson);
        }
      });
    });
  });

  const newName = containerEl.querySelector(".newUser-name");
  const newUserButton = containerEl.querySelector(".newUser-button");
  newUserButton.addEventListener("click", () => {
    const newUserJson = {
      name: newName.value,
    };

    fetch(`http://localhost:8080/users/addUser`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(newUserJson),
    })
      .then((res) => res.json())
      .then((newUsers) => {
        makeUserListViewFromJSON(newUsers);
      });
  });
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
  const homeLink = document.querySelector(".homeLink");
  const meditate = document.querySelector(".meditate");
  const progressLink = document.querySelector(".progressLink");
  const categories = document.querySelector(".categories");
  const aboutLink = document.querySelector(".aboutLink");

  aboutLink.addEventListener("click", () => {
    makeAboutView(user);
  });
  progressLink.addEventListener("click", () => {
    makeProgressView(user);
  });
  categories.addEventListener("click", () => {
    makeCategoriesView(user);
  });
  homeLink.addEventListener("click", () => {
    makeUserView(user);
  });
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

  fetch(
    `https://zenquotes.io/api/random/32bcf235078efe18922329c8829e0c88e4a2098a`
  )
    .then((res) => res.json())
    .then((jsonData) => {
      inspoQuote.innerText = jsonData[0].q;
      inspoAuthor.innerText = "-" + jsonData[0].a;
    });
}


let meditationIncrements = [1, 5, 10, 15, 20, 30]

function makeMeditationView(user, increment) {

    
    containerEl.innerHTML = header();
    containerEl.innerHTML += meditate();

    makeHamburgerMenu(user);

    makeTimer(increment);

    const endButton = document.querySelector(".end-button");
    endButton.addEventListener("click", () => {
        makeProgressView(user);
    })
    
}

function makeProgressView(user) {



    containerEl.innerHTML = header();
    containerEl.innerHTML += progressView(user);

    makeHamburgerMenu(user);
    makeProgressChart(user);

    const sessionDateInput = containerEl.querySelector(".sessionDateInput");
    const sessionDurationInput = containerEl.querySelector(".sessionDurationInput");
    const sessionNoteInput = containerEl.querySelector(".sessionNoteInput");
    const addSessionBtn = containerEl.querySelector(".addSessionButton");
    addSessionBtn.addEventListener("click", () => {
        const newSessionJson = {
            date: sessionDateInput.value,
            duration: sessionDurationInput.value,
            note: sessionNoteInput.value
        }

        fetch(`http://localhost:8080/users/${user.id}/addSession`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(newSessionJson),
        })
        .then((res) => res.json())
        .then((user) => {
            makeProgressView(user);
        })
    })



}

function makeCategoriesView(user){
    
    containerEl.innerHTML = header();
    containerEl.innerHTML += categoryView();

    makeHamburgerMenu(user);

    const topicEl = document.querySelectorAll(".topic-header");

    topicEl.forEach(topic => {
        let topicIdEl = topic.querySelector(".topic-value");
        let topich2 = topic.querySelector(".topic");
        topich2.addEventListener("click", () => {
            fetch(`http://localhost:8080/topics/${topicIdEl.value}`)
        .then(res => res.json())
        .then(topic => {
            makeTopicView(user,topic);
        })
        })
    })



  makeHamburgerMenu(user);
}

function makeTopicView(user,topic) {
    containerEl.innerHTML = header();
    containerEl.innerHTML += topicView(topic);

    makeHamburgerMenu(user);
}

function makeAboutView(user) {
  containerEl.innerHTML = header();
  containerEl.innerHTML += aboutView();


    makeHamburgerMenu(user);

    const closeBtn = document.getElementById('close');
    const targetDiv = document.getElementById('abc');
    const btn = document.getElementById('toggle');
    btn.onclick = function () {
        if (targetDiv.style.display !== "none") {
            targetDiv.style.display = "none";
            document.getElementById('toggle')
        } else {
            targetDiv.style.display = "block";

        }

    };
    closeBtn.onclick = function () {
        document.getElementById("abc").style.display = "none";
    }




}

function makeTimerSelectView(user) {
  containerEl.innerHTML = header();
  containerEl.innerHTML += timerSelectView(meditationIncrements);

  makeHamburgerMenu(user);

  const incrementChoices = document.querySelectorAll(".increment-container");
  incrementChoices.forEach((increment) => {
    increment.addEventListener("click", () => {
      const incrementID = increment.querySelector(".increment-id");
      makeMeditationView(user, incrementID.value);
    });
  });
}


const mindsetCardContainer = document.querySelector(".card-container");

function makeMindsetView() {
  fetch(`http://localhost:8080/mindset`)
    .then((res) => res.json())
    .then((mindsetCards) => {
      mindsetCardContainer.innerHTML = mindsetView();

      const cardsEl = mindsetCardContainer.querySelectorAll(".card-container");

      cardsEl.forEach((mindsetCard) => {
        let mindsetCardIdEl = mindsetCardContainer.querySelector("");
      });
    });
}

function makeProgressChart(user) {
    console.log(user);

    let days = [];
    user.sessions.forEach(session => {
        days.push(session.date);
    })

    let minutes = [];
    user.sessions.forEach(session => {
        minutes.push(session.duration)
    })

    let myChart = document.getElementById('myChart').getContext('2d');
    let progressChart = new Chart(myChart, {
      type:'line',
      data:{
        labels: days,
        datasets:[{
          label:'Meditation Minutes',
          data: minutes
        }]
      },
      options:{}
    });
}

