class SemesterAverage
{
  public static void main (String args[])
  {
    System.out.println("Give me your first mark");
    double mark1 = In.getDouble();
    System.out.println(mark1);
    System.out.println("Give me your second mark");
    double mark2 = In.getDouble();
    System.out.println(mark2);
    double markTotal = (mark1+mark2);
    System.out.println(markTotal);
    System.out.println("Give me your third mark");
    double mark3 = In.getDouble();
    System.out.println(mark3);
    System.out.println("Give me your fourth mark");
    double mark4 = In.getDouble();
    System.out.println(mark4);
    markTotal = (markTotal+mark3+mark4);
    System.out.println(markTotal);
    double average = (markTotal/4);
    System.out.println("Your average is " + average);
  }
}