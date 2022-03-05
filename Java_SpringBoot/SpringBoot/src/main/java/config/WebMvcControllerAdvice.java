package config;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class WebMvcControllerAdvice {
	@ExceptionHandler(TestException.class){
		public String testException(TestException e, Model model) {
			model.addAllAttributes(null);
			return "";
		}
	}
}
