let submitBtn = document.getElementById("submit");
let error = document.getElementById("error");
let form = document.forms[0];
error.style.display = "none";

submitBtn.addEventListener("click", function () { checkLogin(); });

async function checkLogin() {
    let email = form.email.value;

    try {
        let response = await fetch("http://localhost:8080/bank-app-rest/customers/"+email);
        let data =  await response.json();
        console.log(data);
    }
    catch(err) {
         error.style.display = "block";
         error.innerText = "Enter Correct credentials"
    }
} 