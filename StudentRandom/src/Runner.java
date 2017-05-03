import java.util.Random;
public class Runner {
	
	Runner myRunner = new Runner();

	public static void main(String[] args) {
		Runner myRunner = new Runner();
		Random rand = new Random();
		Student[] classB3 = new Student[10];
//		//Student[] classB3 = {new Student("JT Blankenship"),
//				new Student("Heather Schone"),
//				new Student("Dylan Ward"),
//				new Student("Donovan Wright"),
//				new Student("Jake Glick"),
//				new Student("James Baker"),
//				new Student("Egzona Rexhepi"),
//				new Student("Ryan Brooks"),
//				new Student("Conner Figal"),
//				new Student("Alex Johnston")};
		
		myRunner.fillStudentArray(classB3);
		
		myRunner.pickRandomStudent();
	}

	private void fillStudentArray(Student[] classB3){
		// when done we want an array Student[] with all members of this class -- full name --> first last
		// instantiate an array of Student[]
		
		classB3[0] = new Student("Heather Schone"); 
		classB3[1] = new Student("Dylan Ward"); 
		classB3[2] = new Student("Donovan Wright");
		classB3[3] = new Student("JT Blankenship");
		classB3[4] = new Student("Jake Glick"); 
		classB3[5] = new Student("James Baker"); 
		classB3[6] = new Student("Egzona Rexhepi"); 
		classB3[7] = new Student("Ryan Brooks"); 
		classB3[8] = new Student("Conner Figal"); 
		classB3[9] = new Student("Alex Johnston"); 
		
		for(int i = 0; i < classB3.length; i++){
			System.out.println("index " + i + " for student: " + classB3[i].getFullName());
		}
		
		//myRunner.pickRandomStudent(classB3);
		
	}
	
	private void pickRandomStudent(){
		
		
		
	}

}
