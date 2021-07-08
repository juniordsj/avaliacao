package recursosClasse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/cotarroz")
public class arrozRecurso {
	
	@GetMapping
	public String dadosCot() {
		return"";
	}

}
