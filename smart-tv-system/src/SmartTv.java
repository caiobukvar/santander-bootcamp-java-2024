public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int volume = 25;

  public void turnOn() {
    isOn = true;
    System.out.println("TV ligada.");
  }

  public void turnOff() {
    isOn = false;
    
    System.out.println("TV desligada.");
  }

  public void raiseVolume() {
    volume++;
    System.out.println("Aumentado o volume para: "+ volume);
  }

  public void lowerVolume() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void setVolume(int volume) {
    this.volume = volume;
    System.out.println("Volume setado para: " + volume);
  }

  public void nextChannel() {
    channel++;
    System.out.println("Canal setado para: " + channel);
  }

  public void previousChannel() {
    channel--;
    System.out.println("Canal setado para: " + channel);
  }

  public void setChannel(int channel) {
    this.channel = channel;
    System.out.println("Canal setado para: " + channel);
  }

}
