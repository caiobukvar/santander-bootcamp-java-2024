import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone implements MusicApp, PhoneApp, InternetBrowser {
  private List<String> tabs;
  private String currentPageUrl;

  public Iphone() {
      tabs = new ArrayList<>();
      currentPageUrl = "";
  }

  public static void main(String[] args) {
    Iphone myPhone = new Iphone();

    // Example usage: play music
    myPhone.selectMusic();
    myPhone.pause();
    myPhone.play();

    // Example usage: make a call trough console
    myPhone.call();

    // Example usage: pick up the call
    myPhone.pickUp();

    // Example usage: call the voice mail
    myPhone.callVoiceMail();

    // Example usage: create a new tab
    myPhone.newTab();

    // Example usage: refresh the current page
    myPhone.refreshPage();

    // Example usage: open a new page
    myPhone.showPage();
}
  @Override
  public void play(){
    System.out.println("Music is now playing...");
  }
  @Override
  public void pause() {
    System.out.println("Music playback paused.");
  }
  @Override
  public void selectMusic() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the desired music name: ");
    String desiredMusic = scanner.nextLine();
    System.out.println("Now playing '" + desiredMusic + "'...");
  }
  @Override
  public void call() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number to call: ");
    String numberToCall = scanner.next();
    System.out.println("Calling '" + numberToCall + "'...");
  }
  @Override
  public void pickUp() {
    System.out.println("Call picked up.");
  }
  @Override
  public void callVoiceMail() {
    System.out.println("Calling voice mail.");
  }
  @Override
  public void changeUrl() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the desired page URL: ");
    String pageUrl = scanner.nextLine();
    System.out.println("Redirecting to '" + pageUrl + "'...");
    scanner.close();
  }

  @Override
  public void newTab() {
    String startPageUrl  = "https://www.google.com";
    tabs.add(startPageUrl);
    System.out.println("New tab created: " + startPageUrl);
  }

  @Override
  public void refreshPage() {
    System.out.println("Refreshing page: " + currentPageUrl);
  }
  
}
