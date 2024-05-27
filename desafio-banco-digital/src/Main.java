public class Main {
  public static void main(String[] args){
      SavingsAccount  c1 = new SavingsAccount("Caio", 420, 0.5);
      c1.depositar(100);
      c1.process();
      System.out.println(c1.getBalance());

      CheckingAccount c2 = new CheckingAccount("caio", 420, 5);
      c2.depositar(100);
      c2.process();
      System.out.println(c2.getBalance());
  }
}