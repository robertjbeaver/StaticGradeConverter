package ch7_project2_GradeConverter;

public class GradeMain {

	    public static void main(String[] args) {
	        
	        System.out.println("Welcome to the Letter Grade Converter\n");
	        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            
	            int number = Console.getInt("Enter numerical grade: ");
	            Grade grade = new Grade(number);

	            System.out.println("Letter grade: " + grade.getLetter() + "\n");
	            
	            choice = Console.getString("Continue? (y/n): ", "y", "n");
	            System.out.println();
	        }
	        System.out.println("Exiting...");
	    }
	    
	}