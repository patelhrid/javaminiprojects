class Quadratic
{
  public static void main(String args[])
  {
    System.out.println("Provide an 'a' value");
    double a = In.getDouble();
    System.out.println("Provide an 'b' value");
    double b = In.getDouble();
    System.out.println("Provide an 'c' value");
    double c = In.getDouble();
    double sqroot = (Math.sqrt((Math.pow(b, 2))-4*a*c));
    double answer1 = (((b*-1)+sqroot)/(2*a));
    double answer2 = (((b*-1)-sqroot)/(2*a));
    System.out.println("The first root is: ");
    System.out.printf("%.3f %n", answer1);
    System.out.println("The second root is: ");
    System.out.printf("%.3f %n", answer2);
  }
}
                   