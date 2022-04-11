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
<section class="mindset__focuses">
  <section class="mindsets___growth">
    <h2>Here are some cards to input your whys. Repetition is key.</h2>
    <form>
      <textarea
        id="why"
        name="why"
        rows="5"
        columns="20"
        placeholder="What do you want to do?"
      ></textarea>

      <textarea
        id="why__details"
        name="why__details"
        rows="5"
        columns="20"
        placeholder="Why does this matter to you?"
      ></textarea>
      <input type="submit" />
    </form>

    <section class="growth__card">
      <body>
        <div class="card">
          <div class="card__inner">
            <div class="card__face card__face--front">
              <div class="h2">A thought that's holding you back</div>
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
                    <li>
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                      Nihil, veritatis!
                    </li>
                    <li>
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                      Nihil, veritatis!
                    </li>
                    <li>
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                      Nihil, veritatis!
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
    </section>

  <div class = "whys-card-container">

  <ul>
  ${mindsetCards.mindsetCardsWhy
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
  
       
          
         <p> ${mindsetCardWhy.back}</p>
          
                
         
        </div>
      </div>
    </div>
  </div>
  </div>
  
  
  `;
    })
    .join("")}
  </div>

  <div class="card-input">
  <h2 class="new-card">Add A New Card</h2>
  
  <input type="text" class="card-front-input" placeholder="Front of Card" />
  <input type="text" class="card-back-input" placeholder="Back of Card" />
  <input type="text" class="card-image-input" placeholder="Enter image file" />
  
  
  <button class="add-new-card-button">Add Card</button>
  
</div>    
  `;
}
