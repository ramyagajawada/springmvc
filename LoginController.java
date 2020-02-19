package jbr.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.dao.UserService;
import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;

@Controller
public class LoginController {
 
	@Autowired
	  UserService userService; 
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());
    return mav;
  }
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView showregisterProcess(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") Login login) {
   // ModelAndView mav = new ModelAndView("register");
   // mav.addObject("user", new User());
   // return mav;
  System.out.println(login);
  User user = userService.validateUser(login);
  return new ModelAndView("welcome", "username", login.getUsername());
  } 
}
