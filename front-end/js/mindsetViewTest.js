export default function mindsetViewTest(mindsetCards) {
  console.log(mindsetCards);
  return `
  <body>
    <section class="mindset__card mindset__intro">
      <h1>Mindset sTrainer</h1>

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
        <section class="growth__card">
          This will be a card showing your whys and details
        </section>
        <section class="growth__card">
          This will be a card showing your whys and details
        </section>
      </section>

      <section class="mindsets__victories">
        <h2>
          This section will allow users to interact with a card. The front of
          the card will be a challenging moment. The back of the card will be
          details in winning over struggles.
        </h2>

        <form>
          <textarea
            id="wins"
            name="wins"
            rows="5"
            columns="20"
            placeholder="What is something challenging you have done before?"
          ></textarea>

          <textarea
            id="wins__details"
            name="wins__details"
            rows="5"
            columns="20"
            placeholder="List details"
          ></textarea>
          <input type="submit" />
        </form>

        <section class="wins">
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
        <section class="wins">
          This will be a card showing the wins and details
        </section>
        <section class="wins">
          This will be a card showing the wins and details
        </section>
      </section>
    </section>
  </body>

`;
}
