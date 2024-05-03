package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
      String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

      for(String candidato: candidatos){
        entrandoEmContato(candidato);
      }
    }

    static void entrandoEmContato(String candidato){
      int toques = 1;
      boolean continuarTentando = true;
      boolean atendeu = false;

      do {
        atendeu = atender();
        continuarTentando = !atendeu;

        if(continuarTentando) {
          toques++;
        } else {
          System.out.println("CONTATO REALIZADO COM SUCESSO!");
        } 
        }
      while (continuarTentando &&  toques < 3); {
        if(atendeu){
          System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + toques + " TENTATIVA.");
        } else {
          System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + toques + " REALIZADA.");
        }
      }
    }

    static boolean atender(){
      return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
      String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
      System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

      for(int indice=0; indice < candidatos.length; indice++){
        System.out.println("O candidato de nº " + candidatos[indice]);
      }

      // for para percorer um array de forma resumida:
      for(String candidato: candidatos){
        System.out.println("O candidato de nº " + candidato);
      }
    }

    static void selecaoCandidatos(){
      String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
      int candidatosSelecionados = 0;
      int candidatoAtual = 0;
      double salarioBase = 2000.0;

      while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido );

        if(salarioBase >= salarioPretendido){
          System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
          candidatosSelecionados++;
        }
        candidatoAtual++;
      }
    }

    static void analisarCandidato(double salarioPretendido){
      double salarioBase = 2000.0;

      if(salarioBase > salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO");
      } else if (salarioBase == salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
      } else {
        System.out.println("AGUARDADO O RESULTADO DOS DEMAIS CANDIDATOS");
      }
    }

    static double valorPretendido(){
      return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
