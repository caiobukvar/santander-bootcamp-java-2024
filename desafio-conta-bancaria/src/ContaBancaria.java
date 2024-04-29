import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.println("Saldo: ");
        double saldo = captureDoubleInput(scanner);

        scanner.close();

        System.out.println("Olá " + nome + 
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo 
        + " já está disponível para saque.");
    }

    // ? código para tratar possíveis erros ao digitar um valor não double/int para o saldo:
    private static double captureDoubleInput(Scanner scanner) {
      while (true) {
          try {
              return scanner.nextDouble();
          } catch (java.util.InputMismatchException e) {
              System.out.println("Valor inválido! Por favor, digite um número válido:");
              scanner.next();
        }
      }
    }
}
