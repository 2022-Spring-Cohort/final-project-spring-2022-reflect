export default function mindsetWhy(mindsetCards) {
  return `

  <div class = "wins-card-container">
  <ul>
  ${mindsetCards
    .map((mindsetCardWhy) => {
      return `
  <div class="card">
  <div class="card__inner">
  <input id="id" type="hidden" name="id" value="${mindsetCardWhy.id}">
    <div class="card__face card__face--front">
      <div class="h2">${mindsetCardWhy.front}</div>
    </div>
    <div class="card__face card__face--back">
      <div class="card__content">
        <div class="card__header">
       Image here of what you care about
          <img src= ${mindsetCardWhy.photo} class="pp" />
          <h2>Discomfort is a milestone to growth</h2>
        </div>
  
        <div class="card__body">
          <h3>Reasons that thought is not true</h3>
  
          <ul>
          
          ${mindsetCardWhy.back
            .map((backOfCard) => {
              return `  
         <div class = "listBackOfCard">
         <li class = "backOfCardInput> ${backOfCard} </li>
         
         `;
            })
            .join("")}
                
          </ul>
        </div>
      </div>
    </div>
  </div>
  </div>
  
  
  `;
    })
    .join("")}
  </div>
  `;
}
