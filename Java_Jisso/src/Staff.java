/**
 * @author Daisuke Kusuda 
 * Staffを作成および名前と年齢情報を管理するクラス
 */
public class Staff {
	// --------------------フィールド変数--------------------
	// Staffの名前
	private String name;
	// Staffの年齢
	private int age;

	// --------------------コンストラクタ--------------------
	/**
	 * Staffクラスのコンストラクタ
	 * 
	 * @param name: String Staffの名前
	 * @param age:  int Staffの年齢
	 */
	public Staff(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// --------------------メソッド--------------------
	/**
	 * フィールド変数nameのgetメソッド
	 * 
	 * @return String フィールド変数nameを戻す
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * フィールド変数nameに代入するsetメソッド
	 * 
	 * @param name: String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フィールド変数ageのgetメソッド
	 * 
	 * @return int フィールド変数ageを戻す
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * フィールド変数ageに代入するsetメソッド
	 * 
	 * @param name: age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Staffのフィールド変数を表示するメソッド
	 */
	public void getInformation() {
		System.out.println(this.name + "\t\t" + this.age + "歳");
	}
}
