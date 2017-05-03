package if_elseif_else_002;

import javax.swing.JOptionPane;

/*
 * how to make branching decisions using
 * if
 * elseif
 * else
 */

public class StartHere {
	
	public static void main(String[] args){
		
		String ageInput = "";
		int age = 0;
		String msg = "";
		String genderInput = "";
		char gender = ' ';
		String gradeInput = "";
		int grade = 0;
		
		ageInput = JOptionPane.showInputDialog("Hello, what is your age?");
		age = Integer.parseInt(ageInput);
		
		genderInput = JOptionPane.showInputDialog("What is your gender? :M or F");
		genderInput = genderInput.toUpperCase();
		//char ch = str.charAt(0);
		gender = genderInput.charAt(0);
		
		gradeInput= JOptionPane.showInputDialog("What grade are you? (enter as the number)");
		grade = Integer.parseInt(gradeInput);
		
		
		
		
		/*
		 * get their year in school as 9, 10, 11 or 12
		 */
		
		//msg = "age = " + age + " gender = " + genderInput + " char gender = " + gender;
		//JOptionPane.showMessageDialog(null, msg);
		
		/* test minor or adult (age 18 cutoff)
		 * also test male or female
		 * finally catch errors
		 * test case :
		 * 1. minor female
		 * 2. minor male
		 * 3. adult female
		 * 4. adult male
		 * 5. error
		 */ 
		
		//convert to freshman, sophomore, junior and senior
		
		//booleans= || 'or', && 'and'
		
		if (age < 18 && gender == 'F' && grade == 9){
			
			msg = "You are a minor freshman female.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'M' && grade == 9){
			
			msg = "You are a minor freshman male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'F' && grade == 9){
			
			msg = "You are an adult freshman male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'M' && grade== 9){
			
			msg = "You are an adult freshman male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'F' && grade== 10){
			
			msg = "You are a minor sophomore female.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'M' && grade== 10){
			
			msg = "You are a minor sophomore male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'F' && grade== 10){
			
			msg = "You are an adult sophomore female.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'M' && grade== 10){
			
			msg = "You are an adult sophomore male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'F' && grade== 11){
			
			msg = "You are a minor junior female.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'M' && grade== 11){
			
			msg = "You are a minor junior male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'F' && grade== 11){
			
			msg = "You are an adult junior female.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'M' && grade == 11){
			
			msg = "You are an adult junior male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'F' && grade == 12){
			
			msg = "You are a minor senior female.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age < 18 && gender == 'M' && grade == 12){
			
			msg = "You are a minor senior male.";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'F' && grade == 12){
			
			msg = "You are an adult senior female";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age >= 18 && gender == 'M' && grade == 12){
			
			msg = "You are an adult senior male";
			JOptionPane.showMessageDialog(null, msg);
			
		}else{
			
			msg = "Input error";
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}
