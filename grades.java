class grades
{
  public static void main(String args[])
  {
    System.out.println("Give me one of your grades");
    int mark1 = In.getInt();
    System.out.println("Give me another one of your grades");
    int mark2 = In.getInt();
    System.out.println("Give me another one of your grades");
    int mark3 = In.getInt();
    System.out.println("Give me another one of your grades");
    int mark4 = In.getInt();
    double average = ((mark1+mark2+mark3+mark4)/4);
    System.out.println(average);
  }
}