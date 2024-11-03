package Lab53;


// 53. Local Variables
// Try to use local variables in the function changeMe()
// and print out the local variables in the function main()


public class Lab53 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum=0;
        changeMe(a, b);
        System.out.println("sum = " + sum);
    }

    public static void changeMe(int a, int b) {
        int sum ; 
        sum = a + b;
        System.out.println("sum = " + sum);
    }
}
