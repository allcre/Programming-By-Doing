import java.util.Scanner;

public class TheForgetfulMachine
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Give me a word!");
    keyboard.next();

    System.out.println("Give me a second word!");
    keyboard.next();

    System.out.println("\nGreat, now your favourite number?");
    keyboard.next();

    System.out.println("And your second favourite number...");
    keyboard.next();

    System.out.println("\nWhew! Wasn't that fun?");
  }
}
