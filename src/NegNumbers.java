import java.util.Scanner;

public class NegNumbers {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    num = input.nextInt();

    if (num > 0) {
      System.out.println(num + " is a positive number.");
    } else if (num < 0) {
      System.out.println(num + " is a negative number.");
    } else {
      System.out.println(num + " is zero.");
    }
  }
}


