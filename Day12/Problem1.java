class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
public class Problem1 extends Animal {
    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        obj.sound();
    }
}