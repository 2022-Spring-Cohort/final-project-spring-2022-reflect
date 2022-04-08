export default function aboutView(user) {
    return`
    <div class="main-content">
    <div id="abc">
        <div id="popupContact">
            <!-- Contact Us Form -->
            <form id="contact-form" method="put">
                <img id="close" src="/images/x.png">
                <img id="form-logo" src="/images/logo.png">
                <h4>Name:</h4>
                <input type="text" style="height:35px;" id="name-input" placeholder="Enter name here…" class="form-control"
                    style="width:100%;" /><br />
                <h4>Phone:</h4>
                <input type="phone" style="height:35px;" id="phone-input" placeholder="Enter phone number" class="form-control"
                    style="width:100%;" /><br />
                <h4>Email:</h4>
                <input type="email" style="height:35px;" id="email-input" placeholder="Enter email here…" class="form-control"
                    style="width:100%;" /><br />
                <h4>Additional Notes:</h4>
                <textarea id="notes-input" rows="3" placeholder="Enter your message…" class="form-control"
                    style="width:100%;"></textarea><br />
            
                <button type="button" class="submit-API-button" style="margin-top:20px;">Submit</button>
            </form>
        </div>
    </div>
        <section class="about-reflect">
          <div class="about-us">
            <h1>About Reflect</h1>
            <p>
              The team was formed at We Can Code It virtually in Jan of 2022.
              The goal was to provide a free and enjoyable experience for one
              to "Reflect" on their own life, with available resources at their
              fingertips to help them. We provided, sessions, articles, and a
              calming background with custom oceanwaves by Omnisphere 2 provided.
            </p>
          </div>
        </section>
        <section class="about-reflect">
          <div class="about-us">
            <h1>Meet the Reflect Team</h1>
            <div class="headshots">
            <p>
              <a href="https://www.linkedin.com/in/aweys-pemba/">
            <img src="./images/headshots/aweys2.jpg" alt="Us" width="60" height="60"> 
              </a>
              <a href="https://www.linkedin.com/in/ben-corrigan/">
                <img src="./images/headshots/ben.jpg" alt="Us" width="60" height="60">
              </a>
              <a href="https://www.linkedin.com/in/dallas-baldwin/">
            <img src="./images/headshots/dallas.jpg" alt="Us" width="60" height="60">
              </a>
            </p>
            <p>
              <a href="https://www.linkedin.com/in/dejuanspencer/">
            <img src="./images/headshots/dejuan2.png" alt="Us" width="60" height="60">
              </a>
              <a href="https://www.linkedin.com/in/joe-swysgood/">
            <img src="./images/headshots/joe2.jpg" alt="Us" width="60" height="60">
              </a>
              <a href="https://www.linkedin.com/in/mikethecoder/">
            <img src="./images/headshots/mike.jpg" alt="Us" width="60" height="60">
              </a>
            </p>
            </div>
          </div>
          <a id="toggle" class="contact-button">CONTACT US</a>
        </section>
      </div>
    </div>
    `
}