/**
 * @author Daisuke Kusuda 
 * ManagementStaffを作成および名前と年齢情報を管理するクラス Staffクラスのサブクラス
 */
public class ManagementStaff extends Staff {
	// --------------------フィールド変数--------------------
	// ManagementStaffの役職名
	private String officialTitle;

	// --------------------コンストラクタ--------------------
	/**
	 * コンストラクタ
	 * 
	 * @param name          名前
	 * @param age           年齢
	 * @param officialTitle 役職名
	 */
	public ManagementStaff(String name, int age, String officialTitle) {
		super(name, age);
		this.officialTitle = officialTitle;
	}

	// --------------------メソッド--------------------
	/**
	 * フィールド変数officialTitleのgetメソッド
	 * 
	 * @return String フィールド変数officialTitleを戻す
	 */
	public String getOfficialTitle() {
		return this.officialTitle;
	}

	/**
	 * フィールド変数officialTitleのsetメソッド
	 * 
	 * @param officialTitle String フィールド変数officialTitleに代入
	 */
	public void setOfficialTitle(String officialTitle) {
		this.officialTitle = officialTitle;
	}

	/**
	 * フィールド変数name, age, officiTitleを表示するメソッド
	 */
	public void getInformation() {
		System.out.println(getName() + "\t\t" + getAge() + "歳\t\t" + getOfficialTitle());
	}
}
