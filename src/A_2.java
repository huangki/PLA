import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A_2 {

	public static void main(String[] args) throws FileNotFoundException {
		File F = new File("C:\\grade.txt");
		Scanner in = new Scanner(F);
		String s = "";
		int count = 0;
		while (in.hasNext()) {
			s = in.nextLine();
			count++;

		}
		in.close();
		in = new Scanner(F);
		String NUM[] = new String[count];
		double Score[] = new double[count];
		double a, b, c;
		int i = 0;
		while (in.hasNext()) {
			NUM[i] = in.next();
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			Score[i] = (a + b + c) / 3.0;
			i++;
		}
		String temp1 = "";
		double temp = 0;
		for(int k=1;k<count;k++){
			for(int j =0;j<k;j++){
				if(Score[j]<Score[k]){
					temp=Score[j];
					Score[j]=Score[k];
					Score[k]=temp;
					temp1=NUM[j];
					NUM[j]=NUM[k];
					NUM[k]=temp1;
					
				}
				
				
				
				
			}
			
			
			
		}

		for (int j = 0; j < count; j++) {
			System.out.printf("%s  %.2f\n", NUM[j], Score[j]);
		}

	}
}
