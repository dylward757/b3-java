import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args){
		
		ArrayList <String> al01 = new ArrayList <String> ();
		
		al01.add("JT");
		al01.add("Heather");
		al01.add("hello");
		System.out.println("Results " + al01.get(0)+" "+ al01.get(1));
		
		for(int i = 0; i < al01.size(); i++){
			System.out.println(al01.get(i));
		}
		
		al01.remove("JT");
		
	}
	
}
