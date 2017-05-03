import javax.swing.SwingUtilities;

public class mainIsInHere {

	public static void main(String[] args) {
		
		CardLayoutExample card = new CardLayoutExample();
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				card.createAndShowGUI();
			}
		});
	}
}