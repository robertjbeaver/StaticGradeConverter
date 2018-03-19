package ch7_project2_GradeConverter;

	public class Grade {
	    int number;	   
	    
	    public Grade() {
	        number = 0;
	    }
	    public Grade(int inNumber) {
	        this.number = inNumber;
	    }
	    
	    public void setNumber(int gradeNumber) {
	        number = gradeNumber;
	    }
	    public int getNumber() {
	        return number;
	    }
	    /*
	     *  all data is validated through Console class. No further data
	     *  validation in this class
	     */
	    
	    public String getLetter() {
	        String letter;
	        if (number >= 88) {
	            letter = "A";
	        } else if (number >= 80) {
	            letter = "B";
	        } else if (number >= 67) {
	            letter = "C";
	        } else if (number >= 60) {
	            letter = "D";
	        } else {
	            letter = "F";
	        }
	        return letter;
	    }
	}


