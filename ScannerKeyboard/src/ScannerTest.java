import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your computer number");
		int compnum = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your GPA");
		double gpa = sc.nextDouble();
		System.out.println("Computer Number:" + compnum + " name:" + name + " GPA:" +gpa);
		sc.close();

	}

}
