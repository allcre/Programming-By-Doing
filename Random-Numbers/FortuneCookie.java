import java.util.Random;

public class FortuneCookie
{
  public static void main (String args[])
  {
    Random r = new Random();

    int num;
    String f1, f2, f3, f4, f5, f6;
    String msg = "";
    int n1, n2, n3, n4, n5, n6;

    num = 1 + r.nextInt(6);

    f1 = "Open the doors that are locked.";
    f2 = "You will acheive what you work for.";
    f3 = "There is no success without failure.";
    f4 = "Do something about it instead of complaining.";
    f5 = "Luck comes to those who make their own luck.";
    f6 = "Focusing on yourself is not selfish.";

    n1 = 1 + r.nextInt(54);
    n2 = 1 + r.nextInt(54);
    n3 = 1 + r.nextInt(54);
    n4 = 1 + r.nextInt(54);
    n5 = 1 + r.nextInt(54);
    n6 = 1 + r.nextInt(54);

    switch (num)
    {
      case 1:
        msg = f1;
        break;

      case 2:
        msg = f2;
        break;

      case 3:
        msg = f3;
        break;

      case 4:
        msg = f4;
        break;

      case 5:
        msg = f5;
        break;

      case 6:
        msg = f6;
        break;
    }

    System.out.println("Fortune cookie says: \"" + msg + "\"");
    System.out.println("\t" + n1 + " - " + n2 + " - " + n3 + " - " + n4 + " - " + n5 + " - " + n6);
  }
}
