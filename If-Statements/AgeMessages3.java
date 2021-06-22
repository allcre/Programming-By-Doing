import java.util.Scanner;

public class AgeMessages3
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    int age;
    String name = "";
    String msg = "";

    System.out.print("Your name: ");
    name = keyboard.next();

    System.out.print("Your age: ");
    age = keyboard.nextInt();

    if (age >= 25)
      msg = "You can do pretty much anything";

    if (age < 25 && age > 17)
      msg = "You can vote but not rent a car";

    if (age < 18 && age > 15)
      msg = "You can drive but not vote";

    if (age < 16)
      msg = "You can't drive";

    System.out.println("\n" + msg + ", " + name + ".");
  }
}
