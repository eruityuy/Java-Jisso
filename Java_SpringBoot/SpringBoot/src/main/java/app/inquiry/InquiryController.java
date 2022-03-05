package app.inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/inquiry")
public class InquiryController {
	
	/**
	 * URLからのリクエストをGETしform.htmlを呼ぶ
	 * @param inquiryform InquiryFormのインスタンス
	 * @return inquiry/form.html
	 */
	@GetMapping("/form")
    public String getForm(InquiryForm inquiryForm, Model model) {
        return "inquiry/form";
    }
	
	@PostMapping("/form")
	public String postForm(Model model) {
		return "inquiry/form";
	}

	/**
	 * inquiry/form.htmlからのsubmitをinquiry/confirm.htmlに送る
	 * @param inquiryForm InquiryFormのインスタンス
	 * @param error 入力フォームのバリデーション
	 * @param model confirm.htmlへのAttribute
	 * @return inquiry/confrim.html
	 */
	@PostMapping("/confirm")
	public String postConfirm(
		@Validated InquiryForm inquiryForm,
		BindingResult error,
		Model model) {
		if (error.hasErrors()) {
			return "inquiry/form";
		}
		return "inquiry/confirm";
	}
}