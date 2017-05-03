package test;

import java.util.Scanner;

public class test{
  static String sfinal = "";
  public static String go( String a  ) {
    //final = "";
    if (a.length() < 4){
      sfinal = a;
    }
    else{
      sfinal = a.substring(0,2) + a.substring(a.length()-2, a.length());
    }
    return sfinal;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the word");
    String word = sc.next();
    System.out.println(go(word));
  }
}