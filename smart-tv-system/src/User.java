public class User {
  public static void main(String[] args) throws Exception {
    SmartTv smartTV = new SmartTv();

    System.out.println("------------------------------------------------");
    System.out.println("Dados iniciais da TV:");
    System.out.println("TV ligada? " + smartTV.isOn);
    System.out.println("Canal atual: "+ smartTV.channel);
    System.out.println("Volume: "+ smartTV.volume);
    System.out.println("------------------------------------------------");

    smartTV.turnOn();
    smartTV.turnOff();
    smartTV.raiseVolume();
    smartTV.lowerVolume();
    smartTV.setVolume(70);
    smartTV.nextChannel();
    smartTV.previousChannel();
    smartTV.setChannel(30);
  }
}