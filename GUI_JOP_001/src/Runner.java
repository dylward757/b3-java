import javax.swing.JOptionPane;

/*
 * Dylan Ward
 * 8/25/16
 * 3B
 * Introduction to JOPs - JOptionPanes
 * 
 */

public class Runner {

	public static void main(String[] args) {
		
		//place your field variables here, at the top of the method
		
		String first_name = "";
		String last_name = "";
		String showMsg = "";
	    String age_string = "";
	    int age = 0;
		
	    // convert strings to floats
	    String length_string = "";
	    float length = 0;
	    
	    String width_string = "";
	    float width = 0;
	    
	    String height_string = "";
	    float height = 0;
	    
	    
		first_name = JOptionPane.showInputDialog("What is your first name?");
		
		last_name = JOptionPane.showInputDialog("What is your last name?");
		
		//System.out.println(first_name);
		
		showMsg = "Nice to meet you " + first_name + " " + last_name;
		
		JOptionPane.showMessageDialog(null, showMsg);
		
		age_string = JOptionPane.showInputDialog("How old are you?");
		//System.out.println("age_string: " + age_string);
		
		age = Integer.parseInt(age_string);		
		age = age + 5;
		//System.out.println("int age: " + age);
		
		length_string = JOptionPane.showInputDialog("What is the length of that box?");
		width_string = JOptionPane.showInputDialog("What is the width of that box?");
		height_string = JOptionPane.showInputDialog("What is the height of that box?");
		length = Float.parseFloat(length_string);
		width = Float.parseFloat(width_string);
		height = Float.parseFloat(height_string);
		//System.out.println("length: " + length);
		//System.out.println("width: " + width);
		//System.out.println("height: " + height);
		
		JOptionPane.showInputDialog(null, "The volume of the box is = " + length*width*height);
		
		//volume = length*width*height
		System.exit(0);
	}

}
