import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        int result;
        System.out.println("Choice an operator: +, -, *, %, /");
        operator = sc.next().charAt(0);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case '%':
                result = a % b;
                System.out.println(a + " % " + b + " = " + result);
                break;
            case '/':
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;

            default:
                System.out.println("Thanks You");
                break;
        }
        sc.close();
    }
}