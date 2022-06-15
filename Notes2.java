
import java.io.*;
import java.util.*;

class Notes2 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    File file = new File("FILE PATH!!!!");
    String noOfNotesInFile = null;
    if (file.exists()) {
      System.out.println("File was Found");
      BufferedReader br = null;
      try {
        br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
          noOfNotesInFile = st;
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
      int i = Integer.parseInt(noOfNotesInFile);
      System.out.print(
          "Maximum number of places that are available to store you are going to store: " + i);

      method(i);

    } else {

      System.out.print(
          "Maximum number of places that are available to store you are going to store: ");
      int i = scanner.nextInt();
      method(i);
    }
    scanner.close();
  }

  public static void method(int noOfNotes) {

    int place = 0;
    int input = 0;
    String[] notesContainer = new String[noOfNotes];
    while (input != 4) {
      System.out.println(
          "\nAvailable Features: \n1.Enter the notes\n2.List all notes\n3.Delete the notes\n4.Exit");
      input = scanner.nextInt();
      if (input == 1) {
        System.out.print("Enter the Notes: ");
        scanner.nextLine();
        String notes = scanner.nextLine();
        System.out.print("place: ");
        place = scanner.nextInt();
        notesContainer[place] = notes;
        System.out.println("Saved");
      } else if (input == 2) {
        for (int i = 0; i < noOfNotes; i++) {
          System.out.println(notesContainer[i]);
        }
      } else if (input == 3) {
        System.out.print("Place: ");
        place = scanner.nextInt();
        notesContainer[place] = null;
      } else {
        System.out.println("Finished");
      }
    }
  }
}
