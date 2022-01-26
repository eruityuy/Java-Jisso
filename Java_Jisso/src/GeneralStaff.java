/**
 * @author Daisuke Kusuda 
 * GeneralStaffStaffを作成および名前と年齢情報を管理するクラス Staffクラスのサブクラス
 */
public class GeneralStaff extends Staff {
	// --------------------フィールド変数--------------------
	// 役職名
	private String role;

	// --------------------コンストラクタ--------------------
	/**
	 * コンストラクタ
	 * 
	 * @param name 名前
	 * @param age  年齢
	 * @param role 役職
	 */
	public GeneralStaff(String name, int age, String role) {
		// superフィールド変数name,ageに代入
		super(name, age);
		// フィールド変数roleに代入
		this.role = role;
	}

	// --------------------メソッド--------------------
	/**
	 * フィールド変数roleを戻すgetメソッド
	 * 
	 * @return String フィールド変数roleを戻す
	 */
	public String getRole() {
		return this.role;
	}

	/**
	 * フィールド変数roleの値を代入するsetメソッド
	 * 
	 * @param role String フィールド変数roleに代入
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * フィールド変数情報のgetメソッド
	 * @return String フィールド変数情報を戻す
	 */
	public String getInformation() {
		String information = getName() + "\t\t" + getAge() + "歳\t\t" + getRole();
		return information;
	}
}
