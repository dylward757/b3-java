package ap_frq;

public class RandomLetterChooser extends RandomStringChooser 
{ 
   /** Constructs a random letter chooser using the given string str.
    *  Precondition str contains only letters.
    */ 
   public RandomLetterChooser(String str) 
   {  /* to be implemented in part (b)
 */  } 
   /** Returns an array of single-letter strings.
    *  Each of these strings consists of a single letter from str. Element k  
    *  of the returned array contains the single letter at position k of str. 
    *  For example, getSingleLetters("cat") returns the
    *  array { "c", "a", "t" }.
    */ 
   public static String[] getSingleLetters(String str) 
   {  /* implementation not shown
    */ 
	   
	   RandomLetterChooser letterChooser = new RandomLetterChooser("cat"); 
	   for (int k = 0; k < 4; k++) 
	   { 
	      System.out.print(letterChooser.getNext()); 
	   } 

   } 
} 