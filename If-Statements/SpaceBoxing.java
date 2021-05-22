import java.util.Scanner;

public class SpaceBoxing
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    int weight, planet;
    double newWeight = 0.0;

    System.out.print("Please enter your current earth weight: ");
    weight = keyboard.nextInt();

    System.out.println("\nI have information for the following planets:");
    System.out.println("1. Venus  2. Mars   3. Jupiter");
    System.out.println("4. Saturn 5. Uranus 6. Neptune");

    System.out.print("\nWhich planet are you visiting? ");
    planet = keyboard.nextInt();

    switch(planet)
    {
      case 1:
        newWeight = 0.78 * weight;
        break;

      case 2:
        newWeight = 0.39 * weight;
        break;

      case 3:
        newWeight = 2.65 * weight;
        break;

      case 4:
        newWeight = 1.17 * weight;
        break;

      case 5:
        newWeight = 1.05 * weight;
        break;

      case 6:
        newWeight = 1.23 * weight;
        break;

      default:
        System.out.println("Error");
    }

    System.out.println("\nYour weight would be " + newWeight + " pounds on that planet.");
  }
}
