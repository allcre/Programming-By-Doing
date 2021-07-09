import java.util.Scanner;

public class ParallelArrays
{
  public static void main (String args[])
  {
    Scanner kb = new Scanner(System.in);

    String[] names = {"Mitchell", "Oritz", "Luu", "Zimmerman", "Brooks"};
    double[] grades = {99.5, 78.5, 95.6, 96.8, 82.7};
    int[] ids = {123456, 813225, 823669, 307760, 827131};

    System.out.println("Values:");

    for(int i = 0; i < names.length; i++)
    {
      System.out.println("\t" + names[i] + " " + grades[i] + " " + ids[i]);
    }

    System.out.print("\nID number to find: ");
    int lookup = kb.nextInt();
    System.out.println();

    for (int i = 0; i < ids.length; i++)
    {
      if (lookup == ids[i])
      {
        System.out.println("Found in slot " + i);
        System.out.println("\tName: " + names[i]);
        System.out.println("\tAverage: " + grades[i]);
        System.out.println("\tID: " + ids[i]);
      }
    }
  }
}
