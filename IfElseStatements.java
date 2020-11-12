package ifelsestatements;

public class IfElseStatements {

    static void gradeChecker(){
        int grade = 94;
        if (grade<50) {
            System.out.println("You have failed.");
        }else {
            System.out.println("You have passed.");
        }
        
        if (grade>100) {
            System.out.println("Invalid input.");
        } else if (grade>90) {
            System.out.println("Congratulations on your mark!");
        }
}
    
    public static void main(String[] args) {
        gradeChecker();
    }
    
}
