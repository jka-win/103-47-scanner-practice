import java.util.Scanner;

public class VariableInputs {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a string of text:");
      String stringInput = scanner.nextLine();
      System.out.println("Enter an integer:");
      int intInput = Integer.parseInt(scanner.nextLine());
      System.out.println("Enter a double:");
      double doubleInput = Double.parseDouble(scanner.nextLine());
      System.out.println("Enter a boolean value:");
      boolean booleanInput = Boolean.parseBoolean(scanner.nextLine());

      System.out.println("Your string is " + stringInput);
      System.out.println("Your integer is " + intInput);
      System.out.println("Your double is " + doubleInput);
      System.out.println("Your boolean is " + booleanInput);
    }
  }
}
