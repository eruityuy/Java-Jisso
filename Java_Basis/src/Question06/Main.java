package Question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// 配列の生成(宣言)
		String[] array = new String[5];
		
		// 配列の生成
		for(int i = 0; i < array.length; i++) {
			//　i番目の配列入力
			System.out.print("文字を入力してください"+ (i + 1) + "個目：");
			
			// 文字の入力と配列要素へ代入
			String brStr = br.readLine();
			array[i] = brStr;
		}
		
		// 文字出力
		System.out.print("入力された文字は");
		for(String str : array) {
			System.out.print(str + " ");
		}
	}
}
