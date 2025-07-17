import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second float: ");
        double num2 = sc.nextDouble();
        
        if (Math.round(num1 * 1000) == Math.round(num2 * 1000)) {
            System.out.println("Numbers are equal up to three decimal places.");
        } else {
            System.out.println("Numbers are NOT equal up to three decimal places.");
        }
        sc.close();
    }
}
