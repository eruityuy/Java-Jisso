package Question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// メッセージ入力
		System.out.println("整数を入力してください");

		// 整数入力受付(文字列→整数)
		String str = br.readLine();
		int number = Integer.parseInt(str);

		// 偶数か奇数か判定
		if ((number % 2) == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}
}
