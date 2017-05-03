package switch_case_003;

public class Executive {

	public static void main(String[] args){
		
		grading('A'); //call a method named grading, pass it a char to act upon
		grading('B');
		grading('C');
		grading('D');
		grading('F');
		grading('a');
		grading('1');
		grading('s');
	}
	
	public static void grading (char grade){ //this is a method named grading
		int success;
		switch(grade){
		
	    case 'A':
	    	System.out.println("Excelent grade");
	    	success = 1;
	    	break;
	    case 'B':
			System.out.println("Very good grade");
			success = 1;
			break;
		case 'C':
			System.out.println("Good grade");
			success = 1;
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Low grade");
			success = 0;
			break;
		default:
			System.out.println("Invalid grade, must enter A-F");
			success = -1;
		}
		
		passTheCourse(success);
		
	} //end of grading
	
	public static void passTheCourse(int succeed){
		
		/*
		 * case 1. succeed = 1 syso "on track to pass this course"
		 * case 2. succeed = 2 syso "Danger, you may fail"
		 * case 3. succeed = 3 syso "there is an error"
		 */
		
		System.out.println("\nEntering passTheCourse\n");
		
		switch (succeed){
			case 1:
				System.out.println("Congradulations, you are on track to pass this class");
				break;
				
			case 0:
				System.out.println("Danger, you may fail");
				break;
			
			case -1:
				System.out.println("There is an error in method grading");
				break;
				
			default:
				System.out.println("Error in the method passTheCourse");
				break;
			}
		System.out.println();
	}
	
} //end of Executive
