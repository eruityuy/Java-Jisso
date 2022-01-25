package Question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 整数の入力指示
		System.out.println("数字を入力してください");
		System.out.println("「100」を入力した数字で除算します");

		try {
		// 整数の入力
		String str = br.readLine();
		int number = Integer.parseInt(str);
		
		// 100 / numberの計算結果
			double ans = 100.0 / number;
			System.out.println(ans);
		} catch (ArithmeticException e) { // 0が入力された場合
			System.out.println("0で除算できません");
		} catch (NumberFormatException e) { // 数字以外入力された場合
			System.out.println("数字以外が入力されました");
		} finally {
			System.out.println("終了");
		}
	}
}
