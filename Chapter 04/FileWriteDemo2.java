import java.util.Scanner;
import java.io.*;

/**
   This program writes data to a file. It makes sure the
   specified file does not exist before opening it.
*/

public class FileWriteDemo2
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // File name
      String friendName;    // Friend's name
      int numFriends;       // Number of friends

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();

      // Consume the remaining newline character.
      keyboard.nextLine();
      
      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
      // Create a File object.
      File file = new File(filename);
      
      // If the file does not exist, create it.
      if (!file.exists())
      {
         // Open the file.
         PrintWriter outputFile = new PrintWriter(file);
         
         // Get data and write it to the file.
         for (int i = 1; i <= numFriends; i++)
         {
            // Get the name of a friend.
            System.out.print("Enter the name of friend " +
                             "number " + i + ": ");
            friendName = keyboard.nextLine();
      
            // Write the name to the file.
            outputFile.println(friendName);
         }
         
         System.out.println("Data written to the file.");
      }
      else
      {
         System.out.println("The file already exists.");
      }
   }
}
