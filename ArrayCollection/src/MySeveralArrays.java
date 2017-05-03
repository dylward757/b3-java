import java.util.ArrayList;

public class MySeveralArrays {

	public static void main(String[] args) {
		
		String myString = "I totally love computer science";
		
//		String[] myStr = new String[3];
//		myStr[0] = "Dylan";
//		myStr[1] = "JT";
//		myStr[2] = "Egzona";
		
		String[] myStr = {"Heather", "Alex", "Ryan"};
		
		String[] myKids = new String[6];
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		//make a regular [] of student objects
		
		Student[] myClass = new Student[3];
		
		myClass[0] = new Student("Donovan", "Wright", 11);
		myClass[1] = new Student("Heather", "Schone", 11);
		myClass[2] = new Student("Dylan", "Ward", 11);
		//myClass[3] = new Student("James", "Baker", 11);
		//myClass[4] = new Student("James", "Baker", 11);
		//myClass[5] = new Student("James", "Baker", 11);
		//myClass[6] = new Student("James", "Baker", 11);
		//myClass[7] = new Student("James", "Baker", 11);
		
		for(int i = 0; i < myClass.length; i++){
			System.out.println(myClass[i].getFname() + " " + myClass[i].getLname() + " " + myClass[i].getGradeInSchool());
		}
		
		//System.out.println(myClass[1].getFname());
		//System.out.println(myClass[1].setLname("Smith"));
		
		
		
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////
		//int[][] myIntMatrix = new int[2][3]
		int[][] myIntMatrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		//by convention [rows] [colums] in a spreadsheet
		//here, it is an array of arrays
		
		ArrayList <String> myALString = new ArrayList <String>();
		ArrayList <Integer> myALInt = new ArrayList<Integer>();
		ArrayList <String> myStudents = new ArrayList <String>();
		ArrayList <Object> myObj = new ArrayList <Object>();
		
		myALInt.add(10);
		myALInt.add(12);
		myALInt.add(14);
		myALInt.add(16);
		myALInt.add(18);
		
		System.out.println(myString.length());
		System.out.println(myString.charAt(0));
		System.out.println(myString.equals("Python"));
		System.out.println(myString.substring(5));
		System.out.println(myString.substring(2, 9));
		System.out.println(myString.indexOf('t'));
		
		for(int i = 0; i < myStr.length; i++){
			System.out.println(myStr[i]);
		}
		for(int row = 0; row < myIntMatrix.length; row++){
			for(int col = 0; col < myIntMatrix[row].length; col++){
				System.out.println("Row = " + row + " Col = "+ col + " value " + myIntMatrix[row][col]);
			}
		}
		
		for(int i = 0; i < myALInt.size(); i++){
			System.out.println("My AL ints = " + myALInt.get(i));
		}

		System.out.println("charAt 3 " + myALInt.get(3));
		System.out.println("index of 13 " + myALInt.indexOf(13));
		System.out.println("does it contain 16? " + myALInt.contains(16));
		
		/*
		 * An expression that is true if X is strictly the largest of the three variables X, Y and Z. 
		 * For example, if X is 50, Y is 40 and Z is 45, the expression should be true, but if X is 50, 
		 * Y is 40, and Z is 50, the expression should be false, since X is not strictly greater than Z.
		 * (x > y)&&(x > z)
		 */
		
		//int x = 50, y = 40, z = 45; //true
		int x = 50, y = 40, z = 50; //false
		//boolean answer
		
		if((x >= y) && (x >= z)){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		
		//syso answer
		
		//Math.random()
		
		System.out.println("\nTest Math.random()\n");
		
		//double maxNo = Double.MIN_VALUE, minNo = Double.MAX_VALUE;
		double maxNo = 9.0, minNo = 21, rand;
		for(int i = 0; i < 1000000; i++){
			rand = 20*Math.random() - 10;
			if(rand > maxNo)maxNo = rand;
			if(rand < minNo)minNo = rand;			
			//System.out.println("Random Number " + i + " = " + (10*Math.random() + 10.0));
		}
		System.out.println("Min = " + minNo + " Max = " + maxNo);
		
	}

}
