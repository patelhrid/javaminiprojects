class random
{
  public static void main (String args[])
  {
    
    System.out.println("Pick the max. of the range: ");
    int max = In.getInt();
    int min = 0;
    int range = max - min + 1;
    double rand = (Math.random() * range);
    System.out.println(rand);
    
  }
}