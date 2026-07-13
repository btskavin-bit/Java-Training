class Father {
    void house() {
        System.out.println("Father owns a house");
    }
}
public class Problem2 extends Father {
    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        obj.house();
    }
}