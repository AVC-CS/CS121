package Lab56;

public class Lab56 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArray(numbers);
        printArray(numbers);
    }
    public static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
