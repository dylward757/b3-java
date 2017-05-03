
public class StringPractice {

	public static void main(String[] args) {
		String pString = "I love Java";
		String pString2 = "I love Java";
		System.out.println(pString.length());
		System.out.println(pString.charAt(0));
		System.out.println(pString.charAt(pString.length() - 1));
		System.out.println(pString.substring(2, 6));
		System.out.println(pString == pString2);
		System.out.println(pString.equals(pString2));

	}

}
