import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int sum = (n * (n + 1)) / 2; // Sum of first n natural numbers
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        
        sc.close();
    }
}
