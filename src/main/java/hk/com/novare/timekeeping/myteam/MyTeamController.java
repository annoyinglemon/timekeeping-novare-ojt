package my.groupid.about;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTeamController {

	@RequestMapping(value = "myteam")
	public String myteam(Model model) {
		String Venus = "haha";
		model.addAttribute("name", Venus);
        return "myteam/myteam";
    }
}
