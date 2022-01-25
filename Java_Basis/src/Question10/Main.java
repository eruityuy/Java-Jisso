package Question10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader生成
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// 引数なしのPerson生成
		System.out.println("ここでは名前は入力しません");
		Person p1 = new Person();
		p1.printName();

		// 引数ありのPerson生成
		System.out.println("名前を入力してください");
		String str = br.readLine();
		Person p2 = new Person(str);
		p2.printName();
	}
}
