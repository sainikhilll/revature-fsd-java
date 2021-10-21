let submitBtn = document.getElementById("submit");
let error = document.getElementById("error");
let form = document.forms[0];
error.style.display = "none";

submitBtn.addEventListener("click", function () { checkLogin(); });

async function checkLogin() {
    let cred ={
    email : form.email.value,
    passowrd : form.password.value
};
console.log(cred);
    var options ={
        method : "POST",
        credentials : 'include',
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(cred)
    };
    try {
        let response = await fetch("http://localhost:8080/bank-app-rest/authenticate",options);
        //let data =  await response.json();
        
        if (response.status == 200){
            console.log("Login successfyul");
            window.location.href = "Accounts.html";
        
        }
        else if(response.status == "401"){
            console.log("Login failed");
            error.style.display = "block";
            error.innerText = "Enter Correct Credentials";
        }
       else  if(response.status == "404"){
            error.style.display = "block";
            error.innerText = "Enter E-mail and Password";
        }
    }
    catch(err) {
         error.style.display = "block";
         error.innerText = "Server is facing an issue. Try after sometime. Sorry For Inconvenience";
    }
} 