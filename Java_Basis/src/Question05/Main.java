package Question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 数字の入力指示
		try {
			System.out.print("0~6の数字を入力してください。対応した曜日を表示します。：");
			String str = br.readLine();
			int number = Integer.parseInt(str);

			// 数字に対応した曜日の出力
			switch (number) {
			case 0:
				System.out.println("日曜日");
				break;
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			default:
				System.out.println("0~6の範囲で入力してください");
			}
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
		}
	}
}
