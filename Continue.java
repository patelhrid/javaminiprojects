public class Continue {
    
  public static void main(String[] args) { 
    
    System.out.println("Are you a human?");
    char answer = In.getChar();
    if (answer=='y'||answer=='Y'){
      System.out.println("Sorry, I was looking for aliens.");
    }
    else if(answer=='n'||answer=='N'){
      System.out.println("Perfect! I was looking for aliens!");
    }
    else{
    System.out.println("Incorrect input.");
    }
  }
}