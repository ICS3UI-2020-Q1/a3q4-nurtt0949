import java.util.Scanner;

/**
 *This program asks user for a postive integer and then spells out their integer if its btween 1 and 10.
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in); 

    //ask user for positive integer
    System.out.println("Please enter a positve integer");
    int integer = input.nextInt();
    //if the integer is greater than 10
    if (integer > 10){
    System.out.println("Not in the range");
    }
    //if integer is between 1 and 10
    switch(integer){
     case 1 :
      System.out.println("One");
      break;
     case 2 :
      System.out.println("Two");
      break;
     case 3 :
      System.out.println("Three");
      break;
     case 4 :
      System.out.println("Four");
      break;
     case 5 :
      System.out.println("Five");
      break;
     case 6 :
      System.out.println("Six");
      break;
     case 7 :
      System.out.println("Seven");
      break;
     case 8 :
      System.out.println("Eight");
      break;
     case 9 :
      System.out.println("Nine");
      break;
     case 10 :
      System.out.println("Ten");
  }
}
}
