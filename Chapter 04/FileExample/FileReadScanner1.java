import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class FileReadScanner1{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("data.txt"));
        double [] scores = new double[3];
        while(scanner.hasNext()){
            int id = scanner.nextInt();
            String firstName = scanner.next();
            String lastName = scanner.next();
            for(int i = 0; i < 3; i++){
                scores[i] = scanner.nextDouble();
            }
            System.out.printf("ID: %d, First Name: %s, Last Name: %s, Scores: %s\n", id, firstName, lastName, Arrays.toString(scores));
            for(double score : scores){
                System.out.printf("%5.1f ", score);
            }
            System.out.println();
            
        }
        scanner.close();
    }
}
