package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Rajat Gupta");
		List<String> list = new ArrayList<String>();
		list.add("Rohit");
		list.add("Shruti");
		list.add("Gayatri");
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();

		// setting data
		modelAndView.addObject("name", "Rajat Gupta");
		modelAndView.addObject("rollNo", 12564);

		// setting the view page name
		modelAndView.setViewName("help");

		List<Integer> list = new ArrayList<Integer>();
		list.add(124);
		list.add(28378);
		list.add(2938);
		modelAndView.addObject("marks", list);

		return modelAndView;
	}

	
//	  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	  @ExceptionHandler(value = NullPointerException.class) 
//	  public String exceptionHandler() { return "null_page"; }
//	  
//	  
//	  @ResponseStatus(value = HttpStatus.BAD_GATEWAY)
//	  @ExceptionHandler({NullPointerException.class, ArithmeticException.class})
//	  public String exceptionHandle() { return "null_page"; }
	 
}
