import java.util.*;

class Notes {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Maximum number of places that are available to store you are going to store: ");
    int capacity = scanner.nextInt();
    int place = 0;
    String[] notesContainer = new String[capacity];
    while (true) {
      System.out.println("Available Features: \n1.Enter the notes\n2.List all notes\n3.Delete the notes\n4.Exit");
      int input = scanner.nextInt();
      if (input == 1) {
        System.out.print("Enter the Notes: ");
        scanner.nextLine();
        String notes = scanner.nextLine();
        System.out.print("place: ");
        place = scanner.nextInt();
        notesContainer[place] = notes;
        System.out.println("Saved");
      } else if (input == 2) {
        for (int i = 0; i < capacity; i++) {
          System.out.println(notesContainer[i]);
        }
      } else if (input == 3) {
        System.out.print("Place: ");
        place = scanner.nextInt();
        notesContainer[place] = null;
      } else {
        break;
      }
    }
  }
}