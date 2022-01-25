package Question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 数字入力
		System.out.println("数字を2つ入力してください");
		System.out.println("入力した数字の積とそれを2で割った数を計算します");

		System.out.println("数字1");
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);

		System.out.println("数字2");
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);
		
		// 計算結果
		int mul = multiplication(num1, num2);
		int div = divide(mul);
		
		System.out.println("数字1と数字2の積は" + mul + "です");
		System.out.println("積を2で割った数は" + div + "です");
	}

	// 入力した数の掛け算
	public static int multiplication(int a, int b) {
		return a * b;
	}

	// 入力した数を2で割った数
	public static int divide(int a) {
		return a / 2;
	}
}
