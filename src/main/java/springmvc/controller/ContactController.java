package springmvc.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.entities.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model model) {
		model.addAttribute("header", "This is header");
		model.addAttribute("desc", "This is description");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
//		model.addAttribute("header", "This is header");
//		model.addAttribute("desc", "This is description");
		return "contact";
	}
	
//	@RequestMapping(path = "/process-form", method = RequestMethod.POST)
//	public ModelAndView handleForm(@RequestParam("email") String userEmail,
//			@RequestParam("name") String userName, 
//			@RequestParam("pass	word") String password) {
//		
//		ModelAndView modelAndView = new ModelAndView();	
//		
//		modelAndView.addObject("name", userName);
//		modelAndView.addObject("email", userEmail);
//		modelAndView.addObject("password", password);
//		
//		modelAndView.setViewName("success");
//		
//		return modelAndView;
//	}
	
	
	/*
	 * @RequestMapping(path = "/process-form", method = RequestMethod.POST) 
	 * 
	 * public String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("name") String userName,
	 * 
	 * @RequestParam("password") String password, Model model) {
	 * 
	 * User user = new User(); user.setName(userName); user.setEmail(userEmail);
	 * user.setPassword(password);
	 * 
	 * // model.addAttribute("name", userName); 
	 * // model.addAttribute("email",userEmail);
	 * // model.addAttribute("password", password);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */
	
	
	//By using @ModelAttribute
	@RequestMapping(path = "/process-form", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
//		model.addAttribute("header", "This is header");
//		model.addAttribute("desc", "This is description");
		
		this.userService.createUser(user);
		return "success";
	}
	
	
}
