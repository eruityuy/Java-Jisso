package Question10;

class Person {
	private String name;

	// コンストラクタ：引数なし
	public Person() {
		this.name = "名無し";
	}

	// コンストラクタ：String引数（名前）
	public Person(String name) {
		this.name = name;
	}

	// 名前出力メソッド
	public void printName() {
		System.out.println("私の名前は " + this.name + " です");
	}
}
