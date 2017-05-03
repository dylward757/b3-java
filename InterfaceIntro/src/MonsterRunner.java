import java.util.Scanner;

public class MonsterRunner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int size;
		String name;
		int size2;
		String name2;
		
		//Monster myMonster = new Monster();
		
		//ask for name and size
		
		System.out.println("Please enter a name");
		
		 name = keyboard.next();
		
		System.out.println("Enter a size for your monster");
		
		 size = keyboard.nextInt();
		
		//instantiate monster one
		
		Monster mOne = new Skeleton(name, size);
		
		System.out.println("Your first monster is " + name +" and is size "+ size );
		
		//ask for name and size
		
		System.out.println("Please enter a name");
		
		 name2 = keyboard.next();
		
		System.out.println("Enter a size for your monster");
		
		 size2 = keyboard.nextInt();
		
		//instantiate monster two
		 
		Monster mTwo = new Skeleton(name2, size2); 
		
		System.out.println("Your  monster is " + name2 +" and is size "+ size2 );

		if(size > size2){
			System.out.println("Monster 1 is bigger than monster 2");
		}
		else if(size < size2){
			System.out.println("Monster 2 is bigger than monster 1");
		}
		else if(size == size2){
			System.out.println("The monsters are the same size");
		}
		else{
			System.out.println("Something went wrong");
		}
		
		if(name.equals(name2)){
			
			System.out.println("The monsters have the same name");
			
		}else{
			System.out.println("The monsters have different names");
		}
		
	}

}
