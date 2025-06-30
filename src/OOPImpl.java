//class Pen{
//    String color;
//    String type;
//    public void write(){
//        System.out.println("writing");
//    }
//}

// this keyword: this is a reference variable that refers to the current object,
// or can be said “this” in Java is a keyword that refers to the current object instance

class Student{
    String name;
    Integer age;

    // Constructor
    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("Name: " + this.name + " \nage: " + this.age);
    }
}

public class OOPImpl {
    public static void main(String[] args) {
        Student student1 = new Student("Student 1", 20);
        student1.printInfo();
    }
}
