import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PrintWriter1 {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter out = new PrintWriter("output.txt");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<2;i++){
            int id = sc.nextInt();
            String firstName = sc.next();
            String lastName = sc.next();
            out.printf("%d %s %s\t", id, firstName, lastName);
            for(int j = 0;j<2;j++){
                double score = sc.nextDouble();
                out.printf("%5.1f ", score);
            }
            out.println();
        }
        sc.close();
        out.close();
    }
}
