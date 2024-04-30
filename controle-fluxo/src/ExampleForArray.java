public class ExampleForArray {
    public static void main(String[] args) {
      String alunos [] = {"FELIPE", "JONAS", "MARCOS"};

      for (int i = 0; i < alunos.length; i++){
        System.out.println("O aluno no índice i=" + i + " é " + alunos[i]);
      }

      for(String aluno : alunos){
        System.out.println("O nome do aluno é: " + aluno);
      }

      // 2 for com a mesma responsabilidade
    }
}
