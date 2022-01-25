import common.BusinessException;

/**
 * @author Daisuke Kusuda 
 * StaffManagementを実行するクラス
 */
public class StaffManagementStart {
	// --------------------メソッド--------------------
	/**
	 * エントリーポイント
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws BusinessException {
		new StaffManagement().logicMenu();
		// プログラム終了
		System.out.println("終了");
	}
}
