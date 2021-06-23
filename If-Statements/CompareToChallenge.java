// Uppercase letters have a lesser value than lowercase

public class CompareToChallenge
{
  public static void main (String args[])
  {
    String w1, w2, w3, w4, w5, w6, w7, w8, w9;
    w1 = "apple";
    w2 = "bee";
    w3 = "boolean";
    w4 = "coolio";
    w5 = "Coolio";
    w6 = "Dragon";
    w7 = "flabbergasted";
    w8 = "Zeke";
    w9 = "ghoulish";

    System.out.print("Comparing \"" + w1 + "\" with \"" + w2 + "\" produces ");
    System.out.println(w1.compareTo(w2));

    System.out.print("Comparing \"" + w3 + "\" with \"" + w2 + "\" produces ");
    System.out.println(w3.compareTo(w2));

    System.out.print("Comparing \"" + w1 + "\" with \"" + w1 + "\" produces ");
    System.out.println(w1.compareTo(w1));

    System.out.print("Comparing \"" + w5 + "\" with \"" + w4 + "\" produces ");
    System.out.println(w4.compareTo(w5));

    System.out.print("Comparing \"" + w5 + "\" with \"" + w6 + "\" produces ");
    System.out.println(w5.compareTo(w6));

    System.out.print("Comparing \"" + w6 + "\" with \"" + w7 + "\" produces ");
    System.out.println(w6.compareTo(w7));

    System.out.print("Comparing \"" + w6 + "\" with \"" + w6 + "\" produces ");
    System.out.println(w6.compareTo(w6));

    System.out.print("Comparing \"" + w8 + "\" with \"" + w6 + "\" produces ");
    System.out.println(w8.compareTo(w6));

    System.out.print("Comparing \"" + w8 + "\" with \"" + w9 + "\" produces ");
    System.out.println(w8.compareTo(w9));

    System.out.print("Comparing \"" + w9 + "\" with \"" + w2 + "\" produces ");
    System.out.println(w9.compareTo(w2));

    System.out.print("Comparing \"" + w1 + "\" with \"" + w5 + "\" produces ");
    System.out.println(w1.compareTo(w5));

    System.out.print("Comparing \"" + w1 + "\" with \"" + w3 + "\" produces ");
    System.out.println(w1.compareTo(w3));

    System.out.print("Comparing \"" + w8 + "\" with \"" + w1 + "\" produces ");
    System.out.println(w8.compareTo(w1));
  }
}
