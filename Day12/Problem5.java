class Employee {
    void work() {
        System.out.println("Employee Working");
    }
}
public class Problem5 extends Employee {
    public static void main(String[] args) {
        Problem5 obj = new Problem5();
        obj.work();
    }
}