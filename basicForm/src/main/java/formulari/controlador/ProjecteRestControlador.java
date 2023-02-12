package formulari.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formulari.entitats.Projecte;
import formulari.repositoris.ProjecteDAO;

@RestController
@RequestMapping("restController")
public class ProjecteRestControlador {
	
	@GetMapping("saluda")
	public String saluda() {
		return "<H1> Bona tarda</h1>";
	}
	
	@Autowired
	ProjecteDAO repPro;
	
	@GetMapping("projectes")
	public String projectes(Model model){
	
		model.addAttribute("projectes", repPro.findAll());
		
		return "projectes/llista-projectes";
		 
	}
}


