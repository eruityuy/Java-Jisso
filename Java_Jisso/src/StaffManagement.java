import java.util.ArrayList;
import java.util.List;

import common.BusinessException;
import common.InputData;
import common.SystemMessage;
import common.SystemMessage.ID_MESSAGE;

/**
 * @author Daisuke Kusuda
 *　各入力条件に従ってStaffインスタンスを生成およびフィールド変数staffListに格納し管理するクラス
 */
public class StaffManagement {
	//--------------------フィールド変数--------------------
	// Staffクラスのインスタンスを格納するリスト
	List<Staff> staffList = new ArrayList<Staff>();
	
	
	//--------------------メソッド--------------------
	/**
	 * staffListに社員を追加し情報を表示する。または終了する
	 */
	public void logicMenu() throws BusinessException { 
		while(true) {
			// InputDataクラスのinputIntを実行（0 or 1の入力を促し入力値を戻す）
			int input = new InputData().inputInt(ID_MESSAGE.N0001, 0, 1);
			// 0:社員追加のときaddStaff実行
			if (input == 0) {
				addStaff();
				// 社員情報一覧を表示
				SystemMessage.outMessage(ID_MESSAGE.N0007);
				// 追加した社員情報を列挙表示
				for (int i = 0; i < staffList.size(); i++) {
					staffList.get(i).getInformation();
				}
				continue;
			}
			// 1:終了のときループ処理終了
			if (input == 1) {
				break;
			}
			
		}
	}
	
	/**
	 * Staffインスタンスを生成しリストに追加するメソッド
	 */
	private void addStaff() throws BusinessException {
		// InputDataクラスのinputIntを実行（0 or 1）の入力を促し入力値を戻す
		int input = new InputData().inputInt(ID_MESSAGE.N0002, 0, 1);
		// 0:一般職社員の場合
		if (input == 0) {
			addGeneralStaff();
		}
		// 1:管理職社員の場合
		if (input == 1) {
			addManagementStaff();
		}
	}
	
	/**
	 * GeneralStaff（一般職社員）インスタンスを生成しstaffListに追加
	 */
	private void addGeneralStaff() throws BusinessException {
		// name 名前を入力（10文字以内）
		String inputName = new InputData().inputString(ID_MESSAGE.N0003, 10);
		// age 年齢を入力（0以上）
		int inputAge = new InputData().inputInt(ID_MESSAGE.N0004, 0);
		// role 職種を入力(5文字以内)
		String inputRole = new InputData().inputString(ID_MESSAGE.N0005, 5);
		// GenralStaffインスタンスを生成しstaffListに追加
		staffList.add(new GeneralStaff(inputName, inputAge, inputRole));
	}
	
	/**
	 * ManagementStaff（管理職社員）インスタンスを生成しstaffListに追加
	 */
	private void addManagementStaff() throws BusinessException {
		// name 名前を入力（10文字以内）
		String inputName = new InputData().inputString(ID_MESSAGE.N0003, 10);
		// age 年齢を入力（0以上）
		int inputAge = new InputData().inputInt(ID_MESSAGE.N0004, 0);
		// officialTitle 役職を入力（5文字以内）
		String inputOfficialTitle = new InputData().inputString(ID_MESSAGE.N0006, 5);
		// ManagementStaffインスタンスを生成しstaffListに追加
		staffList.add(new ManagementStaff(inputName, inputAge, inputOfficialTitle));
	}
}