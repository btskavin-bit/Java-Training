public class Problem8 {
    Problem8() {
        System.out.println("Welcome");
    }
    Problem8(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        new Problem8();
        new Problem8("Java Programming");
    }
}