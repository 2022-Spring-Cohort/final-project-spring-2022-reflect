// import { METHODS } from "http";
import aboutView from "./about.js";


function submitToAPI(e) {
    console.log("submitworked")
    var name = document.querySelector("#name-input").value;
    var email = document.querySelector("#email-input").value;
    var desc = document.querySelector("#notes-input").value;
    var data = {
        name: name,
        email: email,
        desc: desc
    };
    console.log(name + email + desc)
    e.preventDefault();
    var URL = "https://d2zsy5nueh.execute-api.us-east-1.amazonaws.com/Deploy1";

    // var Namere = /[A-Za-z]{1}[A-Za-z]/;
    // if (!Namere.test($("#name-input").val())) {
    //     alert("Name can not less than 2 char");
    // return;
    //     }
    // var mobilere = /[0-9]{10}/;
    // if (!mobilere.test($("#phone-input").val())) {
    //     alert("Please enter valid mobile number");
    // return;
    //     }
    // if ($("#email-input").val()=="") {
    //     alert("Please enter your email id");
    // return;
    //     }

    // var reeamil = /^([\w-\.]+@([\w-]+\.)+[\w-]{2, 6})?$/;
    // if (!reeamil.test($("#email-input").val())) {
    //     alert("Please enter valid email address");
    // return;
    //     }


    fetch('https://d2zsy5nueh.execute-api.us-east-1.amazonaws.com/Deploy1', {
        method: 'PUT',
        contentType: "application/json",
        crossDomain:"true",
        body: JSON.stringify(data)
    })
        .then(response => response.json())
        .then(result => {
            console.log('Success:', result);
            alert("Success!");
        })
        .catch(error => {
            console.error('Error:', error);
            alert("UnSuccessful");
        });

        
    // $.ajax({
    //     type: "PUT",
    //     url: "https://d2zsy5nueh.execute-api.us-east-1.amazonaws.com/Deploy1",
    //     dataType: "json",
    //     crossDomain: "true",
    //     contentType: "application/json; charset=utf-8",
    //     data: JSON.stringify(data),


    //     success: function () {
    //         // clear form and show a success message
    //         alert("You are Signed up!");
    //         document.getElementById("contact-form").reset();
    //         location.reload();
    //     },
    //     error: function () {
    //         // show an error message
    //         alert("UnSuccessful");
    //     }
    // });
}

export {submitToAPI}