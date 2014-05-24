package admincontrollers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etap.beans.*;
import etap.servicios.SrvSolicitud;
@Controller
public class SolicitudController {
	@RequestMapping(value = { "admin/solicitudes" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("admin/solicitudes");

		try {
			List<Solicitud> lista = SrvSolicitud.getSolicitud();
			model.addAttribute("Solicitud", lista);
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		return mv;
	}
}