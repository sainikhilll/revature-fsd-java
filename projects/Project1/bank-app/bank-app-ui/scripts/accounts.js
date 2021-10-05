async function getAccounts(){
    let response = await fetch("http://localhost:8080/bank-app-rest/accounts");
    let data = await response.json();
    console.log("Method Executed");
    console.log(data);
}
getAccounts();