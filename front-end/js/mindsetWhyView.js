export default function mindset(mindsetCard) {
  return ` 

  
  <div class = "why-card-container">
  <div class="card">
  <div class="card__inner">
  <input id="id" type="hidden" name="id" value="${mindsetCard.id}">
    <div class="card__face card__face--front">
      <div class="h2">${mindsetCard.front}</div>
    </div>
    <div class="card__face card__face--back">
      <div class="card__content">
        <div class="card__header">
          Image here of what you care about
          <img src="./images/fillerphoto.jpg" class="pp" />
          <h2>Discomfort is a milestone to growth</h2>
        </div>

        <div class="card__body">
          <h3>Reasons that thought is not true</h3>

          <ul>
          ${mindsetCard.back
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
</div>










<div class = "wins-card-container">
<div class="card">
<div class="card__inner">
<input id="id" type="hidden" name="id" value="${mindsetCard.id}">
  <div class="card__face card__face--front">
    <div class="h2">${mindsetCard.front}</div>
  </div>
  <div class="card__face card__face--back">
    <div class="card__content">
      <div class="card__header">
        Image here of what you care about
        <img src="./images/fillerphoto.jpg" class="pp" />
        <h2>Discomfort is a milestone to growth</h2>
      </div>

      <div class="card__body">
        <h3>Reasons that thought is not true</h3>

        <ul>
        ${mindsetCard.back
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
</div>




`;
}
