import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nina {

	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("C:\\1IN.txt"); // 從C槽讀檔(檔名:1IN.txt)
		Scanner input = new Scanner(file); // 建立Scanner名為file
		String[] Process_Name = new String[10];
		int[] Burst_Time = new int[10];
		int[] Priority = new int[10];

		int n = 0;
		while (input.hasNext()) { // 判斷輸入是否有下一個值，若有則繼續while迴圈
			Process_Name[n] = input.next();
			Burst_Time[n] = input.nextInt();
			Priority[n] = input.nextInt();
			System.out.println(Process_Name[n] + " " + Burst_Time[n] + " "
					+ Priority[n]);
			n++;
		}
		for (int i = 0; i <= 10; i++) {
			System.out.println();
		}
		input.close(); // 關閉讀入

	}

}
