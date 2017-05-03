
public class MatrixSearch {

	int odd = 0;
	
	private int[][]mat = new int[10][10];
	
	/*
	 * pre - mat is null
	 * post - mat will be rows * cols
	 * post - mat will contain integers that are >=1 and <=upper
	 */
	
	

	
	public MatrixSearch(int rows, int cols, int upper){
		
		mat = new int[rows][cols];
		
		//nested loops
		// use this
		//m[r][c] = (int)(Math.random()*upper+1);
		
		
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
			
				mat[r][c] = (int)(Math.random()*upper+1);
				
				System.out.println("r,c: " + r + ", " + c + " " + mat[r][c]);
				
			}
		}
	}

	public int countOdds(){
		
		for(int i = 0; i <mat.length; i ++){
			for(int j = 0; j <mat[i].length; j++){
				if(mat[i][j] % 2 == 1)
					odd++;
			}
		}
		
		return 0;
	}
	
	public int countEvens(){
		// do you want to use % or subtract odds
		
		return 0;
	}
	
	public int countPrimes(){
		// do you want to use % or subtract odds
		
		return 0;
	}
	
	private boolean isPrime(int num){
		
		
		return false;
	}
	
	public String toString(){
		
		
		return "";
	}
	
}
