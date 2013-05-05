import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class monkey {

	 	public static void main(String[] args) throws FileNotFoundException {
	 		File f = new File("C:\\input\\hw4_1.txt");
	 		Scanner in = new Scanner(f);
String s = "";
	 		 
	 		while(in.hasNext()){
	 		s= in.next();
	 		}
	 		int count = 0;
	 		for (int i=0;i<s.length();i++){
	 		if(s.charAt(i)=='(')
	 		count++;
	 		if(s.charAt(i)==')')
	 		count--;
	 		}
	 		if (count!=0){
	 		System.out.println("input error");
	 		}
	 		if (count==0){
	 		for(int i=0;i<s.length();i++){
	 		if (count<0){
	 		System.out.println("input error");
	 		break;
	 		}
	 		if (s.charAt(i)=='(')
	 		count++;
	 		if (s.charAt(i)==')')
	 		count--;
	 		}
	 		}
	 		if (count==0){
	 		for (int i=0;i<s.length();i++){
	 		if(s.charAt(i)=='(')
	 		count++;
	 		if (count==0)
	 		System.out.print(s.charAt(i));
	 		if(s.charAt(i)==')')
	 		count--;

	 		}

	}

	 	}}
