import java.util.Random;

/**
   This program simulates 10 tosses of a coin.
*/

public class CoinToss
{
   public static void main(String[] args)
   {
      final int COIN_SIDES = 2;  // The coin has 2 sides.
      
      // Create a Random object to generate random numbers.
      Random rand = new Random();
		
		// Simulate the coin tosses.
		for (int count = 0; count < 10; count++)
		{
			if (rand.nextInt(COIN_SIDES) == 0)
				System.out.println("Tails");
			else
				System.out.println("Heads");
		}
	}
}
