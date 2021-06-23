import java.util.Scanner;

public class AlphabeticalOrder
{
  public static void main (String args[])
  {
    Scanner keyboard = new Scanner (System.in);

    String lName, msg;
    msg = "";

    System.out.print("What's your last name? ");
    lName = keyboard.next();

    if (lName.compareTo("Carswell") <= 0)
      msg = "you don't have to wait long";

    else if (lName.compareTo("Jones") <= 0)
      msg = "that's not too bad";

    else if (lName.compareTo("Smith") <= 0)
      msg = "looks like a bit of a wait";

    else if (lName.compareTo("Young") <=0 )
      msg = "it's gonna be a while";

    else
      msg = "not going anywhere for a while";

    System.out.println(lName + ", " + msg + ".");
  }
}
