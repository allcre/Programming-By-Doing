import java.util.Scanner;

public class BMICalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    double feet, inches, weight, bmi, weightKg, height;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    inches = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    weight = keyboard.nextDouble();

    weightKg = weight / 2.205;

    height = (feet * 12 + inches) / 39.37;
    bmi = weightKg / (height * height);

    System.out.println("\nYour BMI is " + bmi);
  }
}
