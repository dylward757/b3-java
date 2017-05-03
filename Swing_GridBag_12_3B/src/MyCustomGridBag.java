import javax.swing.JFrame;

public class MyCustomGridBag {
	
	public static void createAndShowGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("CustomGridBag");
		
		MyCustomGridBag demo = new MyCustomGridBag();
		//frame.setContentPane(demo.createContentPane);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocation(950, 200);
		frame.setVisible(true);
	}

}//end of class
