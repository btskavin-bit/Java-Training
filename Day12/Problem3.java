class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }
}
public class Problem3 extends Vehicle {
    public static void main(String[] args) {
        Problem3 obj = new Problem3();
        obj.start();
    }
}