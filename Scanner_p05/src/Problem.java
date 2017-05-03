import java.util.*;
import java.io.*;

class Problem{
  public static void main(String[] args) throws IOException{
    Scanner file = new Scanner(new File("file.dat"));
    int times = file.nextInt();
    file.nextLine();
    for(int zz = 0; zz < times; zz++){
      int total = 0;
      int n = 0;
      Scanner chop = new Scanner(file.nextLine());
      while(chop.hasNextInt()){
    	  total += chop.nextInt();
    	  n+=1;
    	  //System.out.println("");
      }
      double ave = (double) total/n;
      System.out.print("AVERAGE = ");
      System.out.format("%.2f", ave);
      System.out.println();
      //System.out.println("AVERAGE = "+ave);
    }
    file.close();
  }
}