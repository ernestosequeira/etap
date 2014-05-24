package admincontrollers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etap.beans.*;
import etap.servicios.SrvUsuario;
@Controller
public class UsuarioController {
	@RequestMapping(value = { "admin/usuarios" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/usuarios");

		try {
			List<Usuario> lista = SrvUsuario.getUsuario();
			model.addAttribute("Usuario", lista);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}
}