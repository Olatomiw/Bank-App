<h1>BANKING APPLICATION</h1>

<p>Followed a Tutorial(@JavaGuides) and also added some changes to the application</p>

<h3>DESCRIPTION</h3>
<p>The application allows user to create account with us. 
<br>The functionality of the app are
</p>
<ul>
<li>
Depositing money to your account
</li>
<li>
Withdrawing from your account with instant reflection of new balance
</li>
<li>
Admin can get name of all bank customers with a Simple logic
</li>

`public List<AccountDto> getAllAccounts() {
List<Account> accounts = accountRepository.findAll();
return accounts.stream().map((account -> AccountMapper.mapToAccountDto(account)))
.collect(Collectors.toList());
}`

</ul>