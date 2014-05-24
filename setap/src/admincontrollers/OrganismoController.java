package admincontrollers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etap.beans.*;
import etap.servicios.SrvOrganismo;
@Controller
public class OrganismoController {
	@RequestMapping(value = { "admin/organismos" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/organismos");

		try {
			List<Organismo> lista = SrvOrganismo.getOrganismo();
			model.addAttribute("Organismo", lista);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}
}
