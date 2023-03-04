public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    switch (args[0]) {
      case "add":
        calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        break;
      case "subtract":
        calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        break;
      case "multiply":
        calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        break;
      case "divide":
        calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        break;
      case "fibonacciNumberFinder":
        calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
        break;
      case "intToBinaryNumber":
        calculator.intToBinaryNumber(Integer.parseInt(args[1]));
        break;
    }
  }
}
