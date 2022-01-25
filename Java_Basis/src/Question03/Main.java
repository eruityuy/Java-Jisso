package Question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 整数の入力
		System.out.println("整数を入力してください");

		String str = br.readLine();
		int number = Integer.parseInt(str);

		// 対角線の出力
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				// 行と列が一致したら"*"、それ以外は"・"
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print("・");
				}
			}
			// 最後は改行
			System.out.println();
		}
	}
}
