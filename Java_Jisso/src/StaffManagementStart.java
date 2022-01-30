import common.BusinessException;

/**
 * @author Daisuke Kusuda StaffManagementを実行するクラス
 */
public class StaffManagementStart {
	// --------------------メソッド--------------------
	/**
	 * エントリーポイント
	 * 
	 * @param args String[]: String型配列
	 */
	public static void main(String[] args) {
		try{
			// StaffManagementインスタンス生成
		StaffManagement sm = new StaffManagement();
		// logicMenuメソッド実行（社員管理メソッド）
		sm.logicMenu();
		} catch (BusinessException e) {
			// Errorメッセージ出力
			System.out.println(e.getStProc());
			// stacktrace出力
			e.printStackTrace();
		}
	}
}
