class BankAccount {
  private int accountNumber;
  private String holder;
  private double balance;


  public BankAccount(String holder, int accountNumber) {
      this.accountNumber = accountNumber;
      this.holder = holder;
  }

  public void withdraw(double value){
      if(accountNumber <= balance) balance-= value;
      else System.out.println("Insufficient balance!");
  }

  public void depositar(double value){
    balance += value;
  }

  public String getInformacoes(){
      return "Holder:" + holder + " Account Number:" + accountNumber + " Balance:" + balance;
  }

  public int getAccountNumber() {
      return accountNumber;
  }

  public String getHolder() {
      return holder;
  }

  public double getBalance() {
      return balance;
  }

  public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
  }

  public void setHolder(String holder) {
      this.holder = holder;
  }
}