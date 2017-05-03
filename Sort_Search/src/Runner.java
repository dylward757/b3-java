import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Sort -- put things in order, alpha, numerical, relevance
		 */
		
		int nums[] = {45, 78, 90, 66, 11};
		Arrays.sort(nums);
		
		for(int item:nums){
			System.out.println(item);
		}
		
		System.out.println();
		
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);			
		}
		System.out.println();
		System.out.println("Index of 90 is " + Arrays.binarySearch(nums, 90));
		System.out.println();
		System.out.println("ToString: " + Arrays.toString(nums));
		
		System.out.println();
		String s = "one two four five";
		String[] words = s.split(" ");
		for (String item:words)
			System.out.println();
		
		System.out.println(words[0]);
		System.out.println(words[3]);

	}

}
