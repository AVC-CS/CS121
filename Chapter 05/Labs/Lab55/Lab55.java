package Lab55;

public class Lab55 {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 
        int sum;
        sum = getSum(num1, num2);
        System.out.println("sum = " + sum);
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}