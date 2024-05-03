public class App {
    public static void main(String[] args)  {
        System.out.println("Inicio do programa no método main");
        a();
        System.out.println("Final do programo no método main");
    }

    static void a(){
      System.out.println("Entrou no método a.");
      b();
      System.out.println("Saiu do método a.");
    }
    static void b(){
      System.out.println("Entrou no método b.");
      for (int i = 0; i <= 4; i++) System.out.println(i);
      c();
      System.out.println("Saiu do método b.");
    }
    static void c(){
      System.out.println("Entrou no método c.");
      Thread.dumpStack();
      System.out.println("Saiu do método c.");
    }
}
