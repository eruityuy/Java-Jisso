package app.inquiry;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

/**
 * @author Nasuno Yoichi
 * お問合せフォームクラス
 */
@Data
public class InquiryForm implements Serializable {
	// ユーザー名
	@NotEmpty(message = "20文字以下で入力してください")
	@Length(max=20, message = "20文字以下で入力してください")
	private String userName;
	
	// Email
	@NotEmpty(message = "Emailの形式で入力してください")
	@Email(message = "Emailの形式で入力してください")
	private String email;
	
	// 内容
	@NotEmpty(message = "必須項目です")
	private String context;
	
	/**
	 * ユーザー名のゲッター
	 * @return ユーザー名
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * Emailのゲッター
	 * @return Email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 内容のゲッター
	 * @return 内容
	 */
	public String getContext() {
		return this.context;
	}
	
	
	/**
	 * ユーザー名のセッター
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Emailのセッター
	 * @param email
	 */
	public void setEmail(String email) {
		this.email  = email;
	}	
		
	/**
	 * 内容のセッター
	 * @param context
	 */
	public void setContext(String context) {
		this.context = context;
	}
}
