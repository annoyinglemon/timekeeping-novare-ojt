package my.groupid.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateUserController {

	@RequestMapping(value = "createuser")
	public String createuser() {
        return "createuser/createuser";
    }
}
