import java.util.Scanner;

public class GenderGame
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    String gender, fName, lName, married, name;
    married = "";
    int age;

    System.out.print("What is your gender (M or F): ");
    gender = keyboard.next();

    System.out.print("First name: ");
    fName = keyboard.next();

    System.out.print("Last name: ");
    lName = keyboard.next();

    System.out.print("Age: ");
    age = keyboard.nextInt();

    if (gender.equals("F") && age >= 20)
    {
      System.out.print("\nAre you married, " + fName + " (y or n)? ");
      married = keyboard.next();
    }

    if (married.equals("y"))
      name = "Mrs. " + lName;

    else if (married.equals("n"))
      name = "Ms. " + lName;

    else if (gender.equals("F") || (gender.equals("M") && age < 20))
      name = fName + " " + lName;

    else
      name = "Mr. " + lName;

    System.out.println("\nThen I shall call you " + name + ".");
  }
}
