import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getInteger
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);


        //factorial
        Boolean confirmation;
        System.out.print("Enter a number between 1 and 10: ");
        System.out.print(factorial(getInteger(1, 10)));
//        do {
//            System.out.println(factorial(getInteger(1, 10)));
//            System.out.println("Do you want to try again? [y/N]");
//            String keepGoing = sc.next();
//            confirmation = keepGoing.equalsIgnoreCase("y");
//        } while (confirmation);
    }

    public static int factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) (n * factorial(n - 1));
        }
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        if (userInput > min && userInput < max) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.\n Try again: ");
            getInteger(min, max);
        }
        return userInput;
    }

    public static void adding(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void subtracting(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void division(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void modulus(int a, int b) {
        int result = a % b;
        System.out.println(result);
    }

    public static void multi(int factor, int base) {
        if (factor == 0) {
            System.out.println(0);
        } else if (factor == 1) {
            System.out.println(base);
        } else if (factor == 2) {
            System.out.println(base + base);
        } else if (factor == 3) {
            System.out.println(base + base + base);
        } else if (factor == 4) {
            System.out.println(base + base + base + base);
        } else {
            System.out.println("sorry...");
        }
    }
}



