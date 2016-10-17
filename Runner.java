
public class Runner {

	public static void main(String[] args) {
		
		String panel_title = "Yo login pretty please";
		
		TextFieldExample login01 = new TextFieldExample(panel_title);
		do{					
			login01.createAndShowGUI();
		} while(login01.isLoginCorrect() !=  true);
		
		
		
		// check for a successful login
		
		boolean goodLogin = login01.isLoginCorrect();
		System.out.println("Do we have a good login: " + goodLogin);
		
		
		
		// if good login, then launch another program
		
		System.out.println("Good login! now launch another class");
		
		
		/*
		 * Yes, you can rewrite class variables
		 * but you are asking for reliability and bug problems,
		 * instead always use setters and getters
		 
		
		int test = login01.intPractice;
		System.out.println("login01.intPractice: " + test);
		
		login01.intPractice = 20;
		System.out.println("login01.intPractice: " + login01.intPractice);
		
		
		login01.getIntPractice();
		login01.setIntPractice(20);
		*/
	}

}
