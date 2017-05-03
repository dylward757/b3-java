//import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Running {

	public static void main(String[] args) {

		List<String> rayList = new ArrayList<String>();
		rayList.add("Egzona");// 6 yes
		rayList.add("Heather"); // 7
		rayList.add("James"); //5
		rayList.add("Jake"); // 4 yes
		rayList.add("Donovan"); // 7
		rayList.add("Dylan"); // 5
		rayList.add("JT"); // 2 yes
		rayList.add("Alex"); // 4 yes
		rayList.add("Ryan"); // 4 yes
		rayList.add("Conner"); // 6 yes
		
		int result = countEvenLength(rayList);
		System.out.println(result);
		System.out.println(rayList);
		Collections.sort(rayList);
		System.out.println();
		System.out.println(rayList);
		Collections.reverse(rayList);
		System.out.println();
		System.out.println(rayList);
	}
	public static int countEvenLength(List<String> rayList){
		int counter = 0;
		for(int i = 0; i < rayList.size(); i++){
			if(rayList.get(i).length() % 2 == 0){
				counter +=1;
			}
		}
		
		
		return counter;
	}

}
