import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner mySwim = new Scanner(System.in);
    String myEvent;
    
    System.out.println("Enter event:"); 
    myEvent = mySwim.nextLine();   
       
    System.out.println("Your event is: " + myEvent);
    
    mySwim.close();
  }
}