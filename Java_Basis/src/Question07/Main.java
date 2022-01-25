package Question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 配列宣言
		int[] array = new int[5];
		System.out.println("5個の数字を入力してください。");

		// 配列要素に入力した数字を代入
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "個目の整数：");
			String str = br.readLine();
			array[i] = Integer.parseInt(str);
		}

		// 昇順バブルソート
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				// 比較して大きければ並べ替え
				if (array[j - 1] > array[j]) {
					// 並び替え
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}

		// 昇順出力
		System.out.println("昇順並べ替え");
		for (int num : array) {
			System.out.println(num);
		}
		System.out.println("最大値は" + array[array.length - 1] + "で、最小値は" + array[0] + "です");
	}
}
