package Question08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		// testメソッド実行
		test();
	}

	public static void test() throws IOException{
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 正方形の大きさ
		System.out.println("数字を入力してください");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		// 正方形出力
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i == j) {
					System.out.print("*");
				}else{
					System.out.print("・");
				}
			}
			System.out.println();
		}
	}
}
