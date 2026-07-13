public class Problem5 {
    Problem5() {
        System.out.println("Student Details");
    }
    Problem5(String name,int age) {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        new Problem5();
        new Problem5("Kavin",20);
    }
}