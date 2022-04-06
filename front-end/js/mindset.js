const cards = document.querySelectorAll(".card__inner");

cards.forEach(card => {
card.addEventListener("click", function () {
  card.classList.toggle("is-flipped");
  console.log("ok")
})

});

const test = document.querySelector(".fortest");
console.log(test);

const mindsetCard = document.createElement("div");
mindsetCard.innerText = "hello";
test.appendChild(mindsetCard);
