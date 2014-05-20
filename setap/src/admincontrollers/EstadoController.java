package admincontrollers;

import java.util.List;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etap.beans.*;
import etap.servicios.SrvEstado;
@Controller
public class EstadoController {
	@RequestMapping(value = { "admin/estados" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/estados");

		try {
			List<Estado> lista = SrvEstado.getEstado();
			model.addAttribute("Estados", lista);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}
}
