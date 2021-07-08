package recursosClasse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/cotsoja")
public class sojaRecurso {
	
	@GetMapping
	public String dadosCot() {
		return"";
	}

}
