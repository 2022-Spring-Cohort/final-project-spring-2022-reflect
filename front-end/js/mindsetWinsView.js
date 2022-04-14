export default function mindsetWins(mindsetCards) {
  return `




  <div class = "wins-card-container cards-container">
  <br/>
  <br/>
  <br/>
  <br/>

  <p> For this section, you will remind yourself of the challenges you've overcome. Reflect on how you were feeling during one of these moments and what it was like to succeed.</p>
  
  <textarea
    id="wins__what"
    name="wins__what"
    class = "wins-card-front-input"
    rows="5"
    columns="20"
    placeholder="List something difficult you've done before."
  >Teest</textarea>

  <textarea
    id="wins__details"
    name="wins__details"
    class = "wins-card-back-input"
    rows="5"
    columns="20"
    placeholder="Elaborate on the type of person you were during this time."
  ></textarea>

  <input type = "file" class = "wins-card-image-input">
  <input class = "wins-submit" type="submit" />


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
  
  <button class="deleteWinsCardButton" value="${mindsetCardWin.id}">Delete Card</button>
  `;
    })
    .join("")}
  </div>


 
  `;
}
