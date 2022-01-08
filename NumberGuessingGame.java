import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {
    System.out.println("Please Guess the number I have in mind! ");
    Scanner scanner = new Scanner(System.in);
    int myNumber = 78;
    while (true) {
      int guessedNumber = scanner.nextInt();
      if (myNumber == guessedNumber) {
        System.out.println("You got it! " + myNumber + " was the right number!");
        break;
      } else if (guessedNumber > myNumber) {
        System.out.println("No, The guess was wrong.");
        System.out.println("My Number is Lower!\n");
      } else {
        System.out.println("No, The guess was wrong.");
        System.out.println("My Number is Higher!\n");
      }
      System.out.println("Please make a new guess!");
    }
    scanner.close();
  }
}
