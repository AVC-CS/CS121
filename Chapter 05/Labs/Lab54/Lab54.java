package Lab54;

public class Lab54 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        changeMe(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void changeMe(int a, int b) {
        a = 100;
        b = 200;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
