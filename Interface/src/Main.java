

//interface testInterface{
//    int a = 10; // final and static and public
//    void display();
//}
//
//
//class TestClass implements testInterface{
//    public void display(){
//        System.out.println("Hello!");
//    }
//}


import java.util.Scanner;


// Payment Method Interface
interface PaymentMethod{
    Scanner in = new Scanner(System.in);
    void pay(double amount);
}

// Class to process Credit Card payments
class CreditCard implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Please enter your pin: ");
        in.nextInt();
        System.out.println("Amount paid: " + amount);
    }
}


class UPI implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Please enter your UPI id: ");
        in.nextLine();
        System.out.println("Amount paid: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod newCard = new CreditCard();
        newCard.pay(500);
        PaymentMethod newUPI = new UPI();
        newUPI.pay(200);
    }
}