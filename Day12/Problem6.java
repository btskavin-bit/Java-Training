class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }
}
public class Problem6 extends Animal {
    public static void main(String[] args) {
        Problem6 obj = new Problem6();
        obj.eat();
    }
}