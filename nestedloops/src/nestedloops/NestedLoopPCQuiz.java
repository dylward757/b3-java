package nestedloops;

public class NestedLoopPCQuiz {

	public static void main(String[] args) {
		
		int size = 9;
		char letter = 'Z';
		
		// nested loops
		for(int i = 0; i < size; i++){
			//System.out.println(letter);
			for(int j = 0; j<size; j++){
				System.out.print(letter);
			}
			System.out.println(letter);
		}

	}

}
