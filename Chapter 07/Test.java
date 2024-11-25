public class Test
{
   public static void main(String[] args)
   {
      double[] grades = { 80.0, 90.0, 100.0 };
      var grader = new Grader(grades);
      System.out.println("Original values =================");
      System.out.println("Lowest : " + grader.getLowestScore());
      System.out.println("Average: " + grader.getAverage());
      System.out.println("Altering values =================");
      grades[0] = 50.0;
      System.out.println("Lowest : " + grader.getLowestScore());
      System.out.println("Average: " + grader.getAverage());
      System.out.println("Altering values =================");
   }
}