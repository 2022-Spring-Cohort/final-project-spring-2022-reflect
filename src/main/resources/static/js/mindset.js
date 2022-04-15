export default function makeCardFlip() {
  const cards = document.querySelectorAll(".card__inner");

  cards.forEach((card) => {
    card.addEventListener("click", function () {
      console.log("flipping");
      card.classList.toggle("is-flipped");
    });
  });
}
