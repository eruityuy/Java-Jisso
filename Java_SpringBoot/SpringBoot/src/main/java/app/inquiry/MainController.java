package app.inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//未完成
//・RequestMapping
//・確認ボタン

@Controller
//@RequestMapping("/inquiry")
public class MainController {
	
	/**
	 * URLからのリクエストをGETしform.htmlを呼ぶ
	 * @param inquiryform InquiryFormのインスタンス
	 * @return inquiry/form.html
	 */
	@GetMapping("/form")
    public String getForm(InquiryForm inquiryform) {
        return "inquiry/form";
    }
	
	@PostMapping("/form")
	public String postForm() {
		return "inquiry/form";
	}

	/**
	 * inquiry/form.htmlからのsubmitをinquiry/confirm.htmlに送る
	 * @param inquiryForm InquiryFormのインスタンス
	 * @param error 入力フォームのバリデーション
	 * @param userName form.htmlからのAttribute
	 * @param email form.htmlからのAttribute
	 * @param context form.htmlからのAttribute
	 * @param model confirm.htmlへのAttribute
	 * @return inquiry/confrim.html
	 */
	@PostMapping("/confirm")
	public String postConfirm(
		@Validated InquiryForm inquiryForm,
		BindingResult error,
		@RequestParam String userName,
		@RequestParam String email,
		@RequestParam String context,
		Model model) {
		if (error.hasErrors()) {
			return "inquiry/form";
		}
		model.addAttribute("userName", userName);
		model.addAttribute("email", email);
		model.addAttribute("context", context);
		return "inquiry/confirm";
	}
}