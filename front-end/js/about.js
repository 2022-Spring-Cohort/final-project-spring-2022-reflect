export default function aboutView(user) {
    return`
    <div class="main-content">
        <section class="about-reflect">
          <div class="about-us">
            <h1>About Reflect</h1>
            <p>
              Formed at We Can Code It, the team consists of 6 developers. They started
              this application as a project to fulfil the need for a simple app
              that didnt get in your way to peace, with over-flooded ads, and subscriptions.
              Here at Reflect, you can reflect your life, when you want to, as long as you want to.
            </p>
          </div>
        </section>
        <section class="about-reflect">
          <div class="about-us">
            <h1>Meet the Reflect Team</h1>
            <div class="headshots">
            <p>
              <a href="https://www.linkedin.com/in/aweys-pemba/">
            <img src="./resources/images/headshots/aweys2.jpg" alt="Us" width="60" height="60"> 
              </a>
              <a href="https://www.linkedin.com/in/ben-corrigan/">
                <img src="./resources/images/headshots/ben.jpg" alt="Us" width="60" height="60">
              </a>
              <a href="https://www.linkedin.com/in/dallas-baldwin/">
            <img src="./resources/images/headshots/dallas.jpg" alt="Us" width="60" height="60">
              </a>
            </p>
            <p>
              <a href="https://www.linkedin.com/in/dejuanspencer/">
            <img src="/resources/images/headshots/dejuan2.png" alt="Us" width="60" height="60">
              </a>
              <a href="https://www.linkedin.com/in/joe-swysgood/">
            <img src="/resources/images/headshots/joe2.jpg" alt="Us" width="60" height="60">
              </a>
              <a href="https://www.linkedin.com/in/mikethecoder/">
            <img src="/resources/images/headshots/mike.jpg" alt="Us" width="60" height="60">
              </a>
            </p>
            </div>
          </div>
        </section>
         <a text-align="center" id="toggle" class="contact-button">CONTACT US</a>
        <div id="abc">
        <div id="popupContact">
            <!-- Contact Us Form -->
            <form id="contact-form" method="put">
                <img id="close" src="/images/x.png">
                <img id="form-logo" src="/images/logo.png">
                <h4>Name:</h4>
                <input type="text" style="height:35px;" id="name-input" placeholder="Enter name here…" class="form-control"
                    style="width:100%;" /><br />
                <h4>Email:</h4>
                <input type="email" style="height:35px;" id="email-input" placeholder="Enter email here…" class="form-control"
                    style="width:100%;" /><br />
                <h4>Additional Notes:</h4>
                <textarea id="notes-input" rows="3" placeholder="Enter your message…" class="form-control"
                    style="width:100%;"></textarea><br />
            
                <button type="button" onClick="submitToAPI(event)" class="submit-API-button" style="margin-top:20px;">Submit</button>
            </form>
            
        </div>
    </div>
      </div>
    </div>
    `
}