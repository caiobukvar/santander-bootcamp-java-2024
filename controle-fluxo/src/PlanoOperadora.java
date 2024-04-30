public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "M";

    switch (plano) {
      case "T":{
        System.out.println("5Gb YouTube");
        // sem break por que quer que a lógica continue e não pare.
      }
      case "M":{
        System.out.println("Whats e Insta grátis");
      }
      case "B":{
        System.out.println("100 minutos de ligação");
      }
    
      default:{
        System.out.println("Nenhum plano selecionado");
        break;
      }
    }

  }
}
