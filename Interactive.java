class Interactive
{
  public static void main(String args[])
  {
    double pi = 3.1415;
    System.out.println("Give me a word: ");
    String thing = In.getString();
    System.out.println("Give me an integer: ");
    int integer = In.getInt();
    System.out.println("Give me a character: ");
    char character = In.getChar();
    System.out.println("Give me another integer: ");
    float number = In.getFloat();
    System.out.println("You are " + (pi*integer) + " years old.");
    System.out.println(thing + " is a cool word.");
    System.out.println("Is " + character + " your favourite character?");
    System.out.println("Is " + number + " your favourite number?");
  }
}