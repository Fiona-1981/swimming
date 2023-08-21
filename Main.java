import java.util.Scanner;
import java.time.Duration;

class Main {
  public static void main(String[] args) {

    Scanner mySwim = new Scanner(System.in);
    Scanner myTime = new Scanner(System.in);
    System.out.println("Enter your event and time:");

    String myEvent = mySwim.nextLine();

    // Duration myEventTime = myTime();
    // User input for Duration required!

    System.out.println("Your event is: " + myEvent + " and your time is " + myEventTime);
    }
}