package Question12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 数字の入力
		System.out.println("数字を2つ入力してください");
		System.out.println("入力した数字の積とそれを2で割った数を計算します");

		System.out.println("数字1");
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);

		System.out.println("数字2");
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);
		
		// AreaCalcChild生成
		AreaCalcChild child = new AreaCalcChild();

		// 計算結果出力
		System.out.println("数字1と数字2の積は" + child.shikaku(num1, num2) + "、積を2で割った数は" + child.sankaku(num1, num2) + "です");
	}
}
