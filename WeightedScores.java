public class WeightedScores {
  
  public static void main(String[] args) { 
  
  System.out.println("Enter test number:");
  int testNumber = In.getInt();
  switch (testNumber)
  {
    case 1:
      System.out.println("Enter test score");
      int score = In.getInt();
      System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + (score*0.1));
      break;
    case 2:
      System.out.println("Enter test score");
      score = In.getInt();
      System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + (score*0.2));
      break;
    case 3:
      System.out.println("Enter test score");
      score = In.getInt();
      System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + (score*0.2));
      break;
    case 4:
      System.out.println("Enter test score");
      score = In.getInt();
      System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + (score*0.15));
      break;
    case 5:
      System.out.println("Enter test score");
      score = In.getInt();
      System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + (score*0.15));
      break;
    case 6:
      System.out.println("Enter test score");
      score = In.getInt();
      System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + (score*0.2));
      break;
  }
    
  }
}
