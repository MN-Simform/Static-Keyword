public class Main {
    private static String name = "Nested Main Class";
//    Nested Static Class
    static class NestedMain{
        public void display(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        System.out.println("Number 2 : " + StaticClass.number2);
        StaticClass.display();

        Main.NestedMain nestedMain = new Main.NestedMain();
        nestedMain.display();
    }
}