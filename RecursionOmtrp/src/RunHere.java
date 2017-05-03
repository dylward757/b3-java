
public class RunHere {

	public static void main(String[] args) {
		
		GraphicsRunner run = new GraphicsRunner();

	}
	
	public static void demo (int x){
		if (x > 0){
			System.out.println(x);
			demo(x);  //this is recursion -- calling itself
		}
	}
	//prog.demo(20);
}
