export default function mindsetWhys(mindsetCards) {
  console.log(mindsetCards);
  return `
  <section class="mindset__card mindset__intro">
  <h1>Mindset Trainer</h1>

  <p>
    A growth mindset can be trained by all of us. Below are prompts to guide
    you into further developing a growth mindset.
  </p>
</section>

<section class="mindset__card mindset__why">
  <h2>Why are you doing this?</h2>
  <p>
    Think about the moments where you struggled and succeeded at the end.
    Remind yourself how you overcame those issues. This can be used to
    encourage yourself because you've won over difficulty before and can do
    it again.
  </p>
</section>

  <section class="mindsets___growth">
    <h2>Here are some cards to input your whys. Repetition is key.</h2>
   
      <textarea

        id="why__what"
        name="why__what"
        class = "why-card-front-input"

        rows="5"
        columns="20"
        placeholder="List a thought that is bothering you."
      ></textarea>

      <textarea
        id="why__details"
        class="why-card-back-input"
        name="why__details"
        class = "why-card-back-input"
        rows="5"
        columns="20"

        placeholder="List a reason this thought is not true."
      ></textarea>

 
      <input class = "why-submit" type="submit" />
  


   
  </section>
  <div class = "whys-card-container cards-container">

<section class="mindset__focuses">
  ${mindsetCards
    .map((mindsetCardWhy) => {
      return `
     
  <div class="card">
    <div class="card__inner">

   <input id="id" type="hidden" name="id" value="${mindsetCardWhy.id}">
    <div class="card__face card__face--front">
      <div class="front-header"><p class = "front-words">${mindsetCardWhy.front}</p></div>
    </div>
    <div class="card__face card__face--back">
      <div class="card__content">
        <div class="card__header">
    
          <h2 class = "why-card-back-header">Discomfort is a milestone to growth</h2>

        </div>
  
        <div class="card__body">
          <h3 class = "why-card-back-header-reasons">Reasons that thought is not true</h3>
  
       
          
         <p class = "why-card-back-words"> ${mindsetCardWhy.back}</p>
          
                
         
        </div>
      </div>
    </div>
  </div>

  <button class="deleteWhyCardButton" value="${mindsetCardWhy.id}">Delete Card</button>
  </div>
</section>
  
  
  `;
    })
    .join("")}

  </div>

  


  `;
}
