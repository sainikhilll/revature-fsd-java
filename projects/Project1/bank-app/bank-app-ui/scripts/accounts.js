async function getAccounts(){
    let response = await fetch("http://localhost:8080/bank-app-rest/accounts");
    let accounts = await response.json();
    console.log("Method Executed");
    console.log(accounts);
// }
// var account1 = {
//     accountNumber: 245542652,
//     balance: 50000
//   };
//   var account2 = {
//     accountNumber: 245542653,
//     balance: 5000

//   };
//   var account3 = {
//     accountNumber: 245542654,
//     balance: 52000

//   };
//   var account4 = {
//     accountNumber: 245542655,
//     balance: 55000

//   };
//   var account5 = {
//     accountNumber: 245542656,
//     balance: 70000

//   };
//   var account6 = {
//     accountNumber: 245542657,
//     balance: 60000
//   };

//   var accounts = [account1, account2, account3, account4, account5, account6];
  let element = "";
  for (var account of accounts) {
    element += `
          <div class="col-12  col-lg-4">
            <div class="card mb-3">
              <div class="card-body">
                <h5 class="card-title">Account Number :${account.accountId}</h5>
                <p class="card-text">Balance :${account.balance} </p>
                <a href="#" class="btn btn-primary mr-auto mb-3">Deposit</a>
                <a href="#" class="btn btn-primary mr-auto mb-3">Withdraw</a>
                <a href="#" class="btn btn-primary mr-auto mb-3">Transfer</a>
                <a href="transactions.html?id=${account.accountId}" class="btn btn-primary mr-auto mb-3">Transactions</a>
              </div>
            </div>
          </div>
        </div>`
  }
  document.getElementById("accounts").innerHTML = element;
}
getAccounts();