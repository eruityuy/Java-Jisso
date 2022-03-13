package config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import app.inquiry.InquiryForm;

// ControllerAdviceが最初に発火
@ControllerAdvice
public class WebMvcControllerAdvice {
	@InitBinder("/inquiry/confirm")
	// 名前やアドレスが空のとき、Nullに変更
	public void initBinder(WebDataBinder binder, InquiryForm inquiryForm) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
}
