package Question14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// ArrayListの宣言
		ArrayList<Integer> list = new ArrayList<Integer>();

		/* 平均の計算 */
		// 平均する数字の入力
		System.out.println("平均を表示したい値を入力してください");
		System.out.println("平均を表示したい値をすべて入力したら「OK」を入力してください");

		// listへ数字を代入
		// 例外処理時にwhileを終了→catchかfinallyにreturn
		while (true) {
			try {
				// 数字の入力
				System.out.println("数字かOKを入力してください");
				String str = br.readLine();

				// "OK"が入力されたらwhile脱出
				if (str.equals("OK")) {
					break;
				}

				// listに数字要素を代入
				int num = Integer.parseInt(str);
				list.add(num);
			} catch (NumberFormatException e) { // 数字ではなければエラー処理
				System.out.println("数字ではありません");
				return;
			}
		}

		// "OK"が入力された場合
		int sum = 0;
		for (int num : list) {
			System.out.println(num);
			sum += num;
		}
		int ave = sum / list.size();
		System.out.println("入力した値の平均は：" + ave);
	}
}
