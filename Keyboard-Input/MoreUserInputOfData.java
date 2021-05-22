import java.util.Scanner;

public class MoreUserInputOfData {
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    String fName, lName, login;
    int grade, id;
    double gpa;

    System.out.println("Please enter the following information so I can sell it for a profit!\n");

    System.out.print("First name: ");
    fName = keyboard.next();

    System.out.print("Last name: ");
    lName = keyboard.next();

    System.out.print("Grade (9-12): ");
    grade = keyboard.nextInt();

    System.out.print("Student ID: ");
    id = keyboard.nextInt();

    System.out.print("Login: ");
    login = keyboard.next();

    System.out.print("GPA (0.0-4.0): ");
    gpa = keyboard.nextDouble();

    System.out.println("\nYour information: ");
    System.out.println("  Login: " + login);
    System.out.println("  ID:    " + id);
    System.out.println("  Name:  " + lName + ", " + fName);
    System.out.println("  GPA:   " + gpa);
    System.out.println("  Grade: " + grade);
  }
}
