import java.util.Arrays;
import java.util.Scanner;

public class Basics {

    // My own function/method
    public static int calcAge(int year){
        return 2025 - year;
    }

    public static void main(String[] args) {
        // First java program
        System.out.println("Hello, World!");
        /*  println vs print
            println: prints a new line after the text
            print prints the text without a new line
        */

        // Variables
        String fname = "Viresh";
        String lname = "Shah";
        Integer age = 20;

        /* Primitive Data Types
            1. byte - 1 byte [-128 to 127]
            2. short - 2 bytes
            3. integer - 4 bytes
            4. long - 8 bytes
            5. float - 4 bytes
            6. double - 8 bytes
            7. char - 2 bytes
            8. boolean - 1 byte (true/false)
        */
        /* Non-primitive data types
            1. String: Immutable type
            2. Arrays
         */

        // Length of a string
        System.out.println(fname.length());
        System.out.println(fname + " " + lname);
        System.out.println(fname.charAt(2));

        // Arrays
//        int[] marks = new int[3]; // Declaration
        int[] marks = {97, 44, 50};
//        marks[0] = 85;
//        marks[1] = 20;
//        marks[2] = 33;
        System.out.println(marks[0]);
        System.out.println(marks.length); // Property of array
        // Sorting an array

        // Explicit type casting in java
        int price = 100;
        int new_price = price + (int)15.25;
        System.out.println(new_price);

        // Constants in java
        final float PI = 3.14F;

        // Taking inputs in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int inp_age = sc.nextInt();
        System.out.println("Your age is: " + inp_age);

        // Conditional Statement
        if (inp_age >= 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are a child");
        }

        Arrays.sort(marks);
        // Loops
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        // Exception Handling
//        try{
//            int divide = 10 / 0; // Throws ArithmeticException
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        // Calling my own method
        System.out.println("Enter your birth year: ");
        int year = sc.nextInt();
        int calculatedAge = calcAge(year);
        System.out.println("Your calculated age is: " + calculatedAge);
    }
}