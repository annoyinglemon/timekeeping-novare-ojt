package hk.com.novare.generatereports;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenerateReportsController {

	@RequestMapping(value = "generatereports")
	public String generatereports() {
        return "generatereports/generatereports";
    }
}
