import java.util.Scanner;
import java.io.*;

/**
   This program uses try-with-resources to open a file for reading.
*/

public class ReadWithTry
{
   public static void main(String[] args) throws IOException
   {
      // Open the file.
      try (Scanner inputFile = new Scanner(new File("Sequence.txt")))
      {
         // Read lines from the file until no more are left.
         while (inputFile.hasNext())
         {
            // Read a line from the file.
            String line = inputFile.nextLine();
            
            // Display the line.
            System.out.println(line);
         }
      }
   }
}