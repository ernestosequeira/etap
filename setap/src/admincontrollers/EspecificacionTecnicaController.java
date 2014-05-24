package admincontrollers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etap.beans.*;
import etap.servicios.SrvEspecificacionTecnica;
@Controller
public class EspecificacionTecnicaController {
	@RequestMapping(value = { "admin/especificacionestecnicas" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/especificacionestecnicas");

		try {
			List<EspecificacionTecnica> lista = SrvEspecificacionTecnica.getEspecificacionTecnica();
			model.addAttribute("EspecificacionesTecnicas", lista);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}
}
