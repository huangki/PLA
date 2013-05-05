import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class salesman {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\input\\hw4_2.txt");
		Scanner in = new Scanner(f);

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
		System.out.println("銷售員 " + " 星期一  " + " 星期二  " + " 星期三  " + " 星期四  "
				+ " 星期五  " + " 合計 ");
		int datesum = 0;
		for (int i = 0; i < (count / 5); i++) {
			System.out.print(i + 1 + "    ");
			for (int j = 0; j < 6; j++) {
				System.out.print(sumsale[j][i] + "   ");
				sumsale[5][i] += sumsale[j][i];
			}
			System.out.println();
		}
		
		System.out.print("合計      ");
		for(int j=0;j<6;j++){
			for(int i =0;i<count/5;i++){
				if(j<5){
				sumfinal[j]+=sumsale[j][i];}
				else{
					sumfinal[j]+=(sumsale[j][i])/2;}
				} 
			System.out.print(sumfinal[j]+"  ");
			}
			
		}
	 
		
	

	}


