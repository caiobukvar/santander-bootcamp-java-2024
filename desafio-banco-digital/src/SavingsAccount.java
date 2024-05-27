public class SavingsAccount extends BankAccount {
  private double yield;

  public SavingsAccount(String holder, int accountNumber, double yield) {
      super(holder, accountNumber);
      this.yield = yield;
  }

  public double getYield() {
      return yield;
  }

  public void setYield(double percentage) {
      if (percentage >= 0 &&  percentage <= 100) this.yield = percentage;
      else percentage = 0;
  }

  public void process(){
      super.depositar(yield / 100 * super.getBalance());
  }

}