package admincontrollers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admin {

	@RequestMapping(value = { "admin/admin" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/admin");

		try {
			response.addCookie(new Cookie("miCookie", "The cookie value"));
			//model.addAttribute("CurrPrincipal", SecurityContextHolder.getContext().getAuthentication().getName());
			String valor = "hola admin";
			
			mv.addObject(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}

	@RequestMapping(value = { "admin/usuarios" }, method = RequestMethod.GET)
	public ModelAndView vistaUsuarios(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/usuarios");

		try {
			String valor = "usuarios del sitio";			
			mv.addObject(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}
	
}
