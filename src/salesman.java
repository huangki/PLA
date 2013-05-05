import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class salesman {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\input\\hw4_2.txt");
		Scanner in = new Scanner(f);
		PrintWriter p = new PrintWriter("C:\\output\\99156122.txt");

		int num = 0;
		int count = 0;
		while (in.hasNext()) {
			num = in.nextInt();
			count++;
		}
		in.close();
		in = new Scanner(f);
		int sumsale[][] = new int[6][(count / 5)];
		int sumfinal[] =new int [6];
		int date = 0;
		int man = 0;

		while (in.hasNext()) {

			sumsale[date][man] = in.nextInt();
			date++;
			if (date % 5 == 0) {
				man++;
				date = 0;
			}
		}
		p.println("銷售員 " + " 星期一  " + " 星期二  " + " 星期三  " + " 星期四  "
				+ " 星期五  " + " 合計 ");
		int datesum = 0;
		for (int i = 0; i < (count / 5); i++) {
			p.print("  "+(i + 1) + "      ");
			for (int j = 0; j < 6; j++) {
				p.print(sumsale[j][i] + "       ");
				sumsale[5][i] += sumsale[j][i];
			}
			p.println();
		}
		
		p.print("合計     ");
		for(int j=0;j<6;j++){
			for(int i =0;i<count/5;i++){
				if(j<5){
				sumfinal[j]+=sumsale[j][i];}
				else{
					sumfinal[j]+=(sumsale[j][i])/2;}
				} 
			p.print(sumfinal[j]+"      ");
			}
			p.close();
		}
	 
		
	

	}


