var transaction1 = {
    transactionId: 1,
    type: "withdrwal",
    amoount: 2000,
    accountId:1
};
var transaction2 = {
    transactionId: 2,
    type: "Deposit",
    amoount: 10000,
    accountId:1
};
var transactions  = [transaction1, transaction2];
var account1 = {
    accountNumber: 11,
    customerId: 9,
    balance: 10000,
    approved: 'y',
    transactions: transactions
};