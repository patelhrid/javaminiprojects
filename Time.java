class Time
{
  public static void main (String arsg[])
  {
    System.out.println("Provide a time (hours here): ");
    int hours = In.getInt();
    System.out.println("Provide a time (minutes here): ");
    double minutes = In.getDouble();
    System.out.println("Provide a time (seconds here): ");
    double seconds = In.getDouble();
    System.out.printf("%.2f %n", (hours+(minutes/60)+(seconds/3600)));
  }
}