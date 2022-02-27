package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nasuno Yoichi
 * "/sample"リクエストのControllerクラス
 */
@Controller
@RequestMapping("/sample")
public class SampleController {
	
	/**
	 * "/tset"リクエストのGET処理
	 * @param model
	 * @return
	 */
	@GetMapping("/test")
	public String index(Model model) {
		// ModelクラスにHello Worldを設定
		model.addAttribute("title", "Hello World");
		// testに入るhtmlをファイル指定
		return "test";
	}
}