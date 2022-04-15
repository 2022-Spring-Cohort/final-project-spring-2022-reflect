function sessionPrompt() {
    let sessionNote = prompt("How do you feel about today's meditation?");
    if (sessionNote == null || sessionNote == "") {
      sessionRespone = sessionNote;
    } else {
      text = "Hello " + person + "! How are you today?";
    }
    document.getElementById("demo").innerHTML = text;
  }