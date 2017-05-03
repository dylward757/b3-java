import javax.swing.JOptionPane;

public class startup {

	public static void main(String[] args) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz ";
		int key = 2;
		String plaintext = "";
		String codedText = "";
		int indexPlaintext = 0;
		int indexShifted = 0;
		
		plaintext = JOptionPane.showInputDialog("Enter your plainText");
		
		for (int i = 0; i < plaintext.length(); i++) {

			indexPlaintext = alpha.indexOf(plaintext.charAt(i));
			indexShifted = indexPlaintext + key;
			
			if (indexPlaintext == 26) {
				
				codedText = codedText + " ";
				
			}
			
			else {
				
				if (indexPlaintext + key > 25) {
					
					indexShifted = indexShifted - 26;
					codedText = codedText + alpha.charAt(indexShifted);
					
				}
				
				else {
		
					codedText = codedText + alpha.charAt(indexShifted);
					
				}
								
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, "Your Coded text is: " + codedText);
		

	}

}
