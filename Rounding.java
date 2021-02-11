class Rounding
{
  public static void main (String args [])
  {
    System.out.println("Provide a number with decimals: ");
    double number = In.getDouble();
    System.out.println("How many decimal places? ");
    int places = In.getInt();
    System.out.printf("%." + places + "f %n", number);
    }
}