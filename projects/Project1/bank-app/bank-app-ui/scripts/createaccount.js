let accountHolderName = document.getElementById("name");
let branch = document.getElementById("branch");
let balance = document.getElementById("balance");
let successMessage = document.getElementById("success");
let errorMessage = document.getElementById("error");
let accountSubBtn = document.getElementById("createAccountButton");
successMessage.style.display = "none";
errorMessage.style.display = "none";
let nameError = document.getElementById("nameError");
let branchError = document.getElementById("branchError");
let balanceError = document.getElementById("balanceError");
accountSubBtn.addEventListener("click", function () {
    let nameValid = true;
    let balanceValid = true;
    let branchValid = true;
    if (accountHolderName.value == "") {
        nameValid = false;
        nameError.innerText = "Name is Manadatory";
        return;
    }
    else if (!accountHolderName.value.match(/^[A-Za-z]+$/)) {
        nameValid = false;
        nameError.innerText = "Numbers and special Character";
        return;
    }
    if (branch.value == "") {
        branchValid = false;
        branchError.innerText = "Branch is Manadatory";
        return;
    }
    if (balance.value == "") {
        balanceValid = false;
        balanceError.innerText = "Balance is Manadatory";
        return;
    }
    else if (balance.value <= 0 || balance.value > 10000000) {
        balanceValid = false;
        balanceError.innerText = "Balance cannot be 0 or negative or more than 10000000";
    }
    else if (!balance.value.match(/^[0-9]+$/)) {
        balanceValid = false;
        balanceError.innerText = "Balance Should be integers only";
    }
    console.log(nameValid);
    console.log(balanceValid);
    console.log(branchValid);
    if (nameValid == true && branchValid == true && balanceValid == true) {
        console.log("clicked");
        createAccount();
    }
});

accountHolderName.addEventListener("keyup", function () {
    if (accountHolderName.value != "") {
        nameError.innerText = "";
    }
});
branch.addEventListener("keyup", function () {
    if (branch.value != "") {
        branchError.innerText = "";
    }
});
balance.addEventListener("keyup", function () {
    if (balance.value != "") {
        balanceError.innerText = "";
    }
});

async function createAccount() {
    let account = {
        name: accountHolderName.value,
        balance: balance.value
    };
    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json" },
        credentials: 'include',
        body: JSON.stringify(account)
    };
    try{
    let response = await fetch("http://localhost:8080/bank-app-rest/accounts",options)
    console.log("Account Creation SuccessFull");
    clearFormData();
    successMessage.style.display = "block";
    successMessage.innerText = "Account Created Successfully. "
    }
    catch(err){
        errorMessage.style.display = "block";
        errorMessage.innerText = "Failed to create account. Retry or report to site administrator.";
    }
};
function clearFormData(){
    accountHolderName.value = "";
    branch.value = "";
    balance.value = "";
}