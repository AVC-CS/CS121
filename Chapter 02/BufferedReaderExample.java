import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        BufferedReader bfrd = new BufferedReader(new InputStreamReader(System.in));
        String inputvalue = bfrd.readLine();
        System.out.println("Your input value is " + inputvalue);

        int number = Integer.parseInt(bfrd.readLine());
        System.out.println("Your input value is " + number);
    }

}
