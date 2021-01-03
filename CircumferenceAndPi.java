class CircumferenceAndPi
{
  public static void main (String args[])
  {
    double pi = 3.1415;
    System.out.println("Pick a number to set the radius: ");
    double radius = In.getDouble();
    double circumference = (2*pi*radius);
    double area = (pi*(Math.pow(radius, 2)));
    System.out.println("The circumference is: ");
    System.out.printf("%.3f %n", circumference);
    System.out.println("The area is: ");
    System.out.printf("%.3f %n", area);
  }
}