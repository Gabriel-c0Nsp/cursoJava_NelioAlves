import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    boolean invalidValue = false;
    int n = 0;
   
    do {

      System.out.print("How many rooms will be rented? ");
      n = scanner.nextInt();
      System.out.println();

      if (n < 1 || n > 10) {
        System.out.println("That's not a valid value. Please, try again!");
        invalidValue = true;
      } else {
        String[] name = new String[n];
        String[] email = new String[n];
        int[] room = new int[n];

        for (int i = 0; i < n; i++) {
          System.out.println("Rent #" + (i+1));
          System.out.print("Name: ");
          scanner.nextLine();
          name[i] = scanner.nextLine();

          System.out.print("Email: ");
          email[i] = scanner.next(); 

          System.out.print("Room: ");
          room[i] = scanner.nextInt();

          System.out.println();
        }

       for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if (room[i] > room[j]) {
            int tempRoom = room[i];
              room[i] = room[j];
              room[j] = tempRoom;

              String tempName = name[i];
              name[i] = name[j];
              name[j] = tempName;

              String tempEmail = email[i];
              email[i] = email[j];
              email[j] = tempEmail;
              }
            }
          }

        System.out.println("Busy rooms: ");

        for (int i = 0; i < n; i++) {
          if (name[i] != null && email[i] != null) {
            System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
          }
        }
            invalidValue = false;
       }

    } while (invalidValue);


    scanner.close();

  }
}
