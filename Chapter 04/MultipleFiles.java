import java.util.Scanner;
import java.io.*;

/**
   This program uses try-with-resources to open two files.
*/

public class MultipleFiles
{
   public static void main(String[] args) throws IOException
   {
      // Open the file.
      try (Scanner inputFile = new Scanner(new File("Sequence.txt"));
           PrintWriter outputFile = new PrintWriter("Copy.txt"))
      {
         // Read lines from the input file until no more are left.
         while (inputFile.hasNext())
         {
            // Read a line from the input file.
            String line = inputFile.nextLine();
            
            // Write the line to the output file.
            outputFile.println(line);
         }
      }
   }
}