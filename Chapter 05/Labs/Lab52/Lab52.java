package Lab52;
import java.util.Arrays;
public class Lab52 {
    public static void main(String[] args) {
        String name = "John";
        int id = 90001234;
        double[] scores = { 95.5, 80.0, 75.5};
        display(name, id, scores);
    }

    public static void display(String name, int id, double[] scores) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Scores: " + Arrays.toString(scores));
    }
}
