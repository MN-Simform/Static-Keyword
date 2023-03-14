public class StaticClass {
    static int number;
    static int number2 = 200;
//    Static Block
    static{
        System.out.println("Static Block Initializer");
        number = 100;
        System.out.println("Number 1 : " + number);
    }
//    Static Method
    static void display(){
        System.out.println("Static Display Method");
        System.out.println("Sum Of Num1 & Num2 : " + (number + number2));
    }
}
