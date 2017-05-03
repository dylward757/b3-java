import javax.swing.SwingUtilities;

public class Runner {
	


	public static void main(String[] args) {
		
		GridBag01 gb01 = new GridBag01();
		GridBag02 gb02 = new GridBag02();
		MyCustomGridBag customGB = new MyCustomGridBag();
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				gb01.createAndShowGUI();
				gb02.createAndShowGUI();
				customGB.createAndShowGUI();

				
			}
		});
		
		
	}//end of main

}//end of class
