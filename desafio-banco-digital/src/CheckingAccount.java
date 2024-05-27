public class CheckingAccount extends BankAccount {
  private double fare;

  public CheckingAccount(String holder, int accountNumber, double fare) {
      super(holder, accountNumber);
      this.fare = fare;
  }

  public double getFare() {
      return fare;
  }

  public void setFare(double fare) {
      this.fare = fare;
  }
  public void process(){
      if(fare > 0){
          withdraw(fare);
      }
  }
}