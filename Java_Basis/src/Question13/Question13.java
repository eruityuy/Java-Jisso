package Question13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 設問13
 * @author kusuda
 *
 */
public class Question13 {
	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		/* 1文字目の入力 */
		// 1文字目の入力
//		System.out.println("2つの同じ言葉を入力してください");
//		System.out.println("一つ目");
//		String str1 = br.readLine();

		/* 2文字目の入力 */
		// 2文字目の入力
//		System.out.println("二つ目");
//		String str2 = br.readLine();

		// 1,2文字目が空白または違う場合の処理
		// 何周かわからない→無限ループ（同じ文字が入ったらbreakで処理）

		while (true) {
			/* 1文字目の入力 */
			// 1文字目の入力
			System.out.println("一つ目");
			String str1 = br.readLine();

			/* 2文字目の入力 */
			// 2文字目の入力
			System.out.println("二つ目");
			String str2 = br.readLine();
			if (str1.equals("") || str2.equals("")) {
				System.out.println("空白です");
				continue;
			// else if 見にくい ifのみ構文→continue; or breakで処理 コメントが書きやすくなる 
			}
			if (!str2.equals(str1)) {
				System.out.println("違う言葉です同じ言葉を入力してください");
				continue;
			}
			if (str1.equals(str2)) {
				System.out.println("同じ言葉です");
				System.out.println("終了");
				break;
			}
		}

//		while (str1.equals("") || str2.equals("") || !str2.equals(str1)) {
//			if (str1.equals("")) {
//				System.out.println("一つ目の文字を入力してください");
//				str1 = br.readLine();
//			}else if (str2.equals("")) {
//				System.out.println("二つ目の文字を入力してください");
//				str2 = br.readLine();
//			} else if (!str2.equals(str1)) {
//				System.out.println("違う言葉です同じ言葉を入力してください");
//				str2 = br.readLine();
//			}
//		}

		// 終了

	}
}
