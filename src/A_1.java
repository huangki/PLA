import java.util.Scanner;


public class A_1 {
 
	public static void main(String[] args) {
		 Scanner in  =new Scanner(System.in);
		 
		 String s = in.nextLine();
		 String o ="";
		 
		 for(int i = 0;i<s.length();i++){
			 
			 if(Character.isLetter(s.charAt(i))==true){
			o+=s.charAt(i);	 
			 }
			 
		 }System.out.print(o.toUpperCase());

	}

}
