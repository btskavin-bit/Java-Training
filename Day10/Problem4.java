public class Problem4 {
    String name;
    int age;
    Problem4(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Problem4 obj = new Problem4("Kavin", 20);
        obj.display();
    }
}