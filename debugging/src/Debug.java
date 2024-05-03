import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
      double media = calcMediaTurma(alunos, scan);

      // ? %.2f mostra 2 casas decimais
      // ? %f = placeholder for a floating point number 
      System.out.printf("Média da turma %.2f", media);
    }

    public static double calcMediaTurma(String[] alunos, Scanner scanner) {
      double soma = 0;
      for(String aluno : alunos){
        System.out.printf("Digite a nota de %s: ", aluno);
        // debug: error input mismatch caso fosse nextInt.
        double nota = scanner.nextDouble();
        soma += nota;
      }

      return soma / alunos.length;
    }
}
