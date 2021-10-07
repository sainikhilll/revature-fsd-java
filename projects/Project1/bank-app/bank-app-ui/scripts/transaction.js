const urlParams = new URLSearchParams(window.location.search);
const accountId = urlParams.get('id');
console.log(accountId);
