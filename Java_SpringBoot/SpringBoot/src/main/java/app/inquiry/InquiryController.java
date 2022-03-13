package app.inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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
	
	/**
	 * URLからのリクエストをPOSTしform.htmlを呼ぶ
	 * @param inquiryForm
	 * @param model
	 * @return inquiry/form.html
	 */
	@PostMapping("/form")
	public String postForm(InquiryForm inquiryForm, Model model) {
		return "inquiry/form";
	}

	/**
	 * inquiry/form.htmlからのsubmitをinquiry/confirm.htmlに送る
	 * @param inquiryForm InquiryFormのインスタンス
	 * @param error 入力フォームのバリデーション
	 * @param model confirm.htmlへのAttribute
	 * @return inquiry/conform.html
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
	
	// リダイレクト時、フラッシュメッセージを表示
	@PostMapping("/complete")
	public String completeForm(RedirectAttributes redirectAttirbutes) {
		redirectAttirbutes.addFlashAttribute("pushedBtn", "登録が成功しました。");
		return "redirect:/inquiry/form";
	}
}