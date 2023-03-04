import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter command: ");

      String input = scanner.nextLine();  // Read user input
      if (Objects.equals(input, "quit")) {
        break;
      }
      calculate(input.split(" "));
    }
  }

  private static void calculate(String[] args) {
    Calculator calculator = new Calculator();
    switch (args[0]) {
      case "add":
        System.out.println(calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        break;
      case "subtract":
        System.out.println(calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        break;
      case "multiply":
        System.out.println(calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        break;
      case "divide":
        System.out.println(calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        break;
      case "fibonacciNumberFinder":
        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));
        break;
      case "intToBinaryNumber":
        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(args[1])));
        break;
    }
  }
}
