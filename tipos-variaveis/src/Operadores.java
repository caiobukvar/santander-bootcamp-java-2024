public class Operadores {
  public static void main(String[] args) {
    // Atribuição

    /*
      * String nome = "Caio";
      * int idade = 22;
      * double peso = 68.5;
      * char sexo = "M";
      * boolean doador = false;
      * Date dataNascimento = new Date();
    */

    // Aritméticos
    /*
     * double soma = 10.5 + 10.1; //soma = 20.6
     * int subtracao = 110 - 5; //subtracao = 105
     * int multiplicacao = 20 * 5; //multiplicacao = 100
     * int divisao = 15 / 3; //divisao = 5
     * int modulo = 18 % 3; //modulo = 0 (significa divisivel por 3)
     * double resultado = (10 * 7) + (20 / 4); //resultado = 75
    */

    // Unários

    int numero = 5;
		System.out.println(- numero); // -5
		System.out.println(numero); // 5
		
		numero = - numero; // conversão para negativo
		System.out.println(numero); // -5
		
		numero = + numero; // operador de soma, não irá converter
    System.out.println(numero); // -5

    numero = numero * -1; //conversão para positivo
    System.out.println(numero); // 5

    int num2 = 10;
    num2++; //mesma coisa de num2 = num2 + 1;
    System.out.println(num2); // 11

    int num3 = 11;
    num3--; //mesma coisa de num2 = num2 - 1;
    System.out.println(num3); // 10

    boolean var = true;
    var = !var;
    System.out.println(var); // false

    // Ternários
    int a, b;
    a = 5;
    b = 6;

    String resultado = "";
    if(a == b){
      resultado = "verdadeiro";
    } else {
      resultado = "falso";
    }

    System.out.println(resultado); //falso, a != b

    int c, d;
    c = 5;
    d = 5;
    String ternario = c==d ? "verdadeiro" : "falso";
    System.out.println(ternario); // verdadeiro

    // Relacionais

    int var1, var2;
    var1 = 2;
    var2 = 3;

    boolean isEqual = var1 == var2;
    System.out.println("var1 é igual à var2? " + isEqual); // falso
    boolean isDiff = var1 != var2;

    System.out.println("var1 é diferente de var2? " + isDiff); // true
    boolean isBigger = var1 > var2;

    System.out.println("var1 é maior à var2? " + isBigger); // false

    boolean isBiggerOrEqual = var1 >= var2;
    System.out.println("var1 é maior ou igual à var2? " + isBiggerOrEqual); //false

    boolean isSmaller = var1 < var2;
    System.out.println("var1 é menor à var2? " + isSmaller); //true

    boolean isSmallerOrEqual = var1 <= var2;
    System.out.println("var1 é menor ou igual à var2? " + isSmallerOrEqual); //true

    // Lógicos

    boolean cond1 = true;
    boolean cond2 = false;
    int verificador = 3;

    String res = cond1 && cond2 ? "Ambas condições são verdadeiras." : "Pelo menos uma condição é falsa.";
    String res2 = cond1 || cond2 ? "Pelo menos uma condição é verdadeira." : "Nenhuma condição é verdadeira.";

    System.out.println(res); //Pelo menos uma condição é falsa.
    System.out.println(res2); //Pelo menos uma condição é verdadeira.

    if(cond1 && (5 > verificador)){
      System.out.println("Condição verdadeira e 5 é maior que o verficador.");
    }
    if(cond1 || (5 < verificador)){
      System.out.println("Ou a condição é verdadeira ou o verifcador é maior que 5.");
    }
  }
}
