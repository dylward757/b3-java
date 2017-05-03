import javax.swing.JOptionPane;

public class TheBeginning {

	public static void main(String[] args) {
		
		/*
		 * 1. Order Pizza, minimum of 5 choices
		 * 2. Order a drink, minimum of 5 choices
		 * 3. When done ordering display the choices of pizza and drink
		 * done
		 */
		
		Object[] possibilities = {"Pepperoni", "Veggie", "Bacon Lover", "Meat Lover", "Hawaiian"};
		Object[] dpossibilities = {"Sprite", "Pepsi", "Root Beer", "Water", "Mountain Dew"};
		String p;
		String d;
		
		p = (String) JOptionPane.showInputDialog(null, "What pizza would you like to order?", "Pizza Order", JOptionPane.PLAIN_MESSAGE, null, possibilities, "");
		d = (String) JOptionPane.showInputDialog(null, "What drink would you like to order?", "Drink Order", JOptionPane.PLAIN_MESSAGE, null, dpossibilities, "");
		
		if ((p != null) && (p.length() > 0) && (d != null) && (d.length() > 0)){
			setLabel("You ordered " + p + " and " + d);
			return;
		}

	}//end of main
	
	public static void setLabel(String passString){
		JOptionPane.showMessageDialog(null, passString);
	}

}
