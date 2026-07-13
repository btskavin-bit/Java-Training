public class problem1 {

    problem1() {
        System.out.println("Default Constructor");
    }

    problem1(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        problem1 obj1 = new problem1();
        problem1 obj2 = new problem1("Kavin");
    }
}