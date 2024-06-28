import java.util.Scanner;

class Calculator {
    int addition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
        return a + b;
    }
}
class CalculatorMainClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int c = calc.addition();
        System.out.println("The sum is: " + c);
    }
}
