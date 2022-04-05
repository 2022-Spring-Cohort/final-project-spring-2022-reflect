const card = document.querySelector(".card__inner");

card.addEventListener("click", function () {
  card.classList.toggle("is-flipped");
});

const test = document.querySelector(".fortest");
console.log(test);

const mindsetCard = document.createElement("div");
mindsetCard.innerText = "hello";
test.appendChild(mindsetCard);
