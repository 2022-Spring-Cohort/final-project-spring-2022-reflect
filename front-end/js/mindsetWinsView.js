export default function mindsetWins(mindsetCards) {
  return `

  <div class = "wins-card-container">

  <form>
  <textarea
    id="win"
    class="wins-card-front-input"
    name="win"
    rows="5"
    columns="20"
    placeholder="What is something hard you've done before?"
  ></textarea>

  <textarea
    id="win__details"
    class="wins-card-back-input"
    name="win__details"
    rows="5"
    columns="20"
    placeholder="How did it make you feel, overcoming this obstacle?"
  ></textarea>

  <input type = "file" class = "wins-card-image-input" id="win-photo" name="win-photo">

  <button class = "win-submit" type = "submit"> Add Card</button>
    </form>
  <ul>
  ${mindsetCards
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
  </div>

 
  `;
}
