
public class Starter {

	public static void main(String[] args) {
			
			//for(startValue; endValue; increment){
			//
			//};
				
				/*int start, stop; //unnecessary, can be inside for loop
				
				for (int i = 10; i >= 0; i--){
					System.out.println("The value of i is: " + i);
				}
				*/
		/*int loopVal, endVal=11, addition=0;
		
		for (loopVal = 1; loopVal < endVal; loopVal++){
			addition = addition + loopVal;
			System.out.println("loopVal, addition: " + loopVal + ", " + addition);
}*/
		int sum = 0;
		for (int i = 1; i <= 100; i++){
			sum = sum+i;
			System.out.println("i, sum " + i + ", " + sum);
}

}
}