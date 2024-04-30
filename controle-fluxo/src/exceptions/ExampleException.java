package exceptions;

public class ExampleException {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("13211631");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O CEP não corresponde com as regras de negócio.");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException{
    if (cep.length() != 8) {
      throw new CepInvalidoException();
    }

    return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);
  }
}
