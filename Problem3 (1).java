import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        
        System.out.print("Enter operator: ");
        char operator = s.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}
