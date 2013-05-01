import java.util.Scanner;

public class str {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String a = "";
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(0)==')'){
				System.out.print("error");
				break;
			}
			if (s.charAt(i) == '(') {
				flag = false;

			} else if (s.charAt(i) == ')') {
				flag = true;
			} else if (flag == true) {
				a += s.charAt(i);
			}
		}
		System.out.print(a);
	}

}
