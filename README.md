# coding

---

### **1. Compare Floats Up to Three Decimals**
```java
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
```

---

### **2. Natural Numbers and Their Sum**
```java
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
```

---

### **3. Check Prime Number**
```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = num > 1;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        System.out.println(num + (isPrime ? " is a Prime Number." : " is NOT a Prime Number."));
        sc.close();
    }
}
```

---

### **4. Age Group Classification**
```java
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid Age");
        }
        
        sc.close();
    }
}
```

---

### **5. Find the Largest Among Three Numbers Using Ternary Operator**
```java
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
        
        sc.close();
    }
}


### **6. Sum of Two Random Numbers**
```java
import java.util.Random;

public class RandomSum {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100); // Random number between 0-99
        int num2 = rand.nextInt(100); // Random number between 0-99

        System.out.println("Random numbers: " + num1 + " and " + num2);
        System.out.println("Sum: " + (num1 + num2));
    }
}
```

---

### **7. Read Two Numbers and Calculate Their Sum**
```java
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        sc.close();
    }
}
```

---

### **8. Find the Largest of Two Numbers**
```java
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Largest number: " + ((a > b) ? a : b));
        sc.close();
    }
}
```

---

### **9. Compare Two Numbers Using All Operators**
```java
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " <= " + b + " = " + (a <= b));
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " >= " + b + " = " + (a >= b));
        System.out.println(a + " == " + b + " = " + (a == b));
        System.out.println(a + " != " + b + " = " + (a != b));

        sc.close();
    }
}
```

---

### **10. Compare Two Characters**
```java
public class CompareCharacters {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';

        System.out.println("'" + a + "' < '" + b + "' = " + (a < b));
        System.out.println("'" + a + "' <= '" + b + "' = " + (a <= b));
        System.out.println("'" + a + "' > '" + b + "' = " + (a > b));
        System.out.println("'" + a + "' >= '" + b + "' = " + (a >= b));
        System.out.println("'" + a + "' == '" + b + "' = " + (a == b));
        System.out.println("'" + a + "' != '" + b + "' = " + (a != b));
    }
}
```

---

### **11. Find the Largest and Smallest Among Four Numbers**
```java
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int largest = Math.max(Math.max(a, b), Math.max(c, d));
        int smallest = Math.min(Math.min(a, b), Math.min(c, d));

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        sc.close();
    }
}
```

---

### **12. Check if Sum of Two Numbers is Even**
```java
import java.util.Scanner;

public class SumEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        System.out.println(sum % 2 == 0 ? "Even" : "Odd");

        sc.close();
    }
}
```

---

### **13. Check if a Number is a Multiple of 100**
```java
import java.util.Scanner;

public class MultipleOf100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num % 100 == 0 ? "Multiple of 100" : "Not a multiple of 100");
        sc.close();
    }
}
```

---

### **14. Check if a Number is a Multiple of 27**
```java
import java.util.Scanner;

public class MultipleOf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num % 27 == 0 ? "Multiple of 27" : "Not a multiple of 27");
        sc.close();
    }
}
```

---

### **15. Check Leap Year**
```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        sc.close();
    }
}
```

---

### **16. Calculator (Character-Based Input)**
```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter operation (a - add, s - subtract, m - multiply, d - divide, u - modulus): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case 'a': System.out.println("Result: " + (num1 + num2)); break;
            case 's': System.out.println("Result: " + (num1 - num2)); break;
            case 'm': System.out.println("Result: " + (num1 * num2)); break;
            case 'd': System.out.println("Result: " + (num1 / num2)); break;
            case 'u': System.out.println("Result: " + (num1 % num2)); break;
            default: System.out.println("Invalid operation!");
        }
        sc.close();
    }
}
```

---

### **17. Infinite Loops**
```java
public class InfiniteLoop {
    public static void main(String[] args) {
        // For Loop
        for (;;) {
            System.out.println("This is an infinite loop!");
            break; // Remove this break to keep it running forever
        }

        // While Loop
        while (true) {
            System.out.println("This is another infinite loop!");
            break; // Remove this break to keep it running forever
        }
    }
}


### **18. Print Numbers from 1 to N**  
```java
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
```
**Sample Input:**  
```
5
```
**Sample Output:**  
```
1 2 3 4 5
```

---

### **19. Print Numbers from 1 to N (Initialization Outside For Loop)**  
```java
import java.util.Scanner;

public class PrintNumbersOutsideLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;  // Initialization outside the loop
        for (; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
```
**Sample Input:**  
```
5
```
**Sample Output:**  
```
1 2 3 4 5
```

---

### **20. Washing Machine Fuzzy System Simulation**  
```java
import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight of clothes in grams: ");
        int weight = sc.nextInt();

        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight <= 2000) {
            System.out.println("Time Estimated: 25 minutes");
        } else if (weight <= 4000) {
            System.out.println("Time Estimated: 35 minutes");
        } else if (weight <= 7000) {
            System.out.println("Time Estimated: 45 minutes");
        } else {
            System.out.println("OVERLOADED");
        }
        sc.close();
    }
}
```
**Sample Input:**  
```
2000
```
**Sample Output:**  
```
Time Estimated: 25 minutes
```

---

### **21. Simple Calculator with 5 Operations**
```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0) result = num1 / num2; 
                else System.out.println("Cannot divide by zero!");
                break;
            case '%': result = num1 % num2; break;
            default: System.out.println("Invalid operation!");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
```
**Sample Input:**  
```
20 15 +
```
**Sample Output:**  
```
Result: 35
```

---

### **22. Switch Case Without Break (Java Streams)**
```java
import java.util.Scanner;
import java.util.stream.Stream;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an option (1-5): ");
        int choice = sc.nextInt();

        Stream.of(choice).forEach(option -> {
            switch (option) {
                case 1: System.out.println("Option 1 selected.");
                case 2: System.out.println("Option 2 selected.");
                case 3: System.out.println("Option 3 selected.");
                case 4: System.out.println("Option 4 selected.");
                case 5: System.out.println("Option 5 selected.");
                default: System.out.println("Invalid choice.");
            }
        });

        sc.close();
    }
}
```
*Note:* This program does not use `break`, so if `1` is selected, it prints all cases below it.

---

### **23. Infinite Loops using `for` and `while`**
```java
public class InfiniteLoops {
    public static void main(String[] args) {
        // Infinite for loop
        for (;;) {
            System.out.println("This is an infinite for loop.");
            break; // Remove to keep it running forever
        }

        // Infinite while loop
        while (true) {
            System.out.println("This is an infinite while loop.");
            break; // Remove to keep it running forever
        }
    }
}
```

---

### **24. Addition and Subtraction (Negative Subtraction as Positive)**
```java
import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = Math.abs(num1 - num2);

        System.out.println("Sum: " + sum);
        System.out.println("Absolute Difference: " + diff);
        sc.close();
    }
}
```
**Sample Input:**  
```
10 20
```
**Sample Output:**  
```
Sum: 30
Absolute Difference: 10
```

---

### **25. Check If a Number is Evenly Divisible by 100**
```java
import java.util.Scanner;

public class DivisibleBy100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num % 100 == 0 ? "Multiple of 100" : "Not a multiple of 100");
        sc.close();
    }
}
```

---

### **26. Check If a Year is a Leap Year**
```java
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        sc.close();
    }
}
`
