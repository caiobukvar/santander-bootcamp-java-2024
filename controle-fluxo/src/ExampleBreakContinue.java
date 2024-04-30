public class ExampleBreakContinue {
  public static void main(String[] args) {
    for (int numero = 0; numero <= 5; numero ++){
      if (numero == 3) {
        continue; //continue apenas pulou quando numero == 3, sem parar o for
      }
      System.out.println(numero);
    }
  }
}
