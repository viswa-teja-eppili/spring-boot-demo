package democontroller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Hellospring() {
		return "Hello my first spring boot app";
	}
}
