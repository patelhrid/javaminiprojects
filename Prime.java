public class Prime {
 
  public static void main(String[] args) { 
    
    System.out.println("Enter an integer: ");
    int number = In.getInt();
    boolean isPrime = false;
    if (number%2 == 1){
      isPrime = true;
    }
    else{
      isPrime = false;
    }
    if (isPrime == true){
      System.out.println("Your number is prime");
    }
    else {
      System.out.println("Your number is even");
    }
  }
}
