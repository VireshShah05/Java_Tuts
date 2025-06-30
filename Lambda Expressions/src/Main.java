// Functional interface definition
interface FunctionalInterface {
    void myFunction(int x);

    default void func1() {
        System.out.println("Hello");
    }
}

// Main class to run the lambda
public class Main {
    public static void main(String[] args) {
        FunctionalInterface fObj = (int x) -> {
            System.out.println(2 * x);
        };
        fObj.myFunction(5); // Output: 10
    }
}
