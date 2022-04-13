export default function mindsetWins(user) {
  return `

  <div class = "wins-card-container cards-container">
  <ul>
  ${user.mindsetCardsWins
    .map((mindsetCardWin) => {
      return `
  <div class="card">
  <div class="card__inner">
  <input id="id" type="hidden" name="id" value="${mindsetCardWin.id}">
    <div class="card__face card__face--front">
      <div class="h2">${mindsetCardWin.front}</div>
    </div>
    <div class="card__face card__face--back">
      <div class="card__content">
        <div class="card__header">
       Image here of what you care about
          <img src= ${mindsetCardWin.photo} class="pp" />
          <h2>Discomfort is a milestone to growth</h2>
        </div>
  
        <div class="card__body">
          <h3>Reasons that thought is not true</h3>
  
       
          
         <p> ${mindsetCardWin.back}</p>
          
                
         
        </div>
      </div>
    </div>
  </div>
  
  </div>
  
  <button class="deleteCardButton"> <input id="id" type="hidden" name="id" value="${mindsetCardWin.id}">Delete Card</button>
  `;
    })
    .join("")}
  </div>

  <div class="card-input">
  <h2 class="new-card">Add A New Card</h2>
  
  <input type="text" class="card-front-input" placeholder="Front of Card" />
  <input type="text" class="card-back-input" placeholder="Back of Card" />
  <input type="text" class="card-image-input" placeholder="Enter image file" />
  
  
  <button class="add-new-win-card-button">Add Card</button>
  
</div>    
  `;
}
