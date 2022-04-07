function submitToAPI(e) {
    console.log("submitworked")
    var name = $("#name-input").val();
    var email = $("#email-input").val();
    var desc = $("#notes-input").val();
    var data = {
        name: name,
        email: email,
        desc: desc
    };
    console.log(name + email + desc)
    e.preventDefault();
    var URL = "https://j8s2u5gmpf.execute-api.us-east-2.amazonaws.com/prod/contact-id-";

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


    $.ajax({
        type: "PUT",
        url: "https://j8s2u5gmpf.execute-api.us-east-2.amazonaws.com/prod/contact-id-",
        dataType: "json",
        crossDomain: "true",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(data),


        success: function () {
            // clear form and show a success message
            alert("You are Signed up!");
            document.getElementById("contact-form").reset();
            location.reload();
        },
        error: function () {
            // show an error message
            alert("UnSuccessful");
        }
    });
} 