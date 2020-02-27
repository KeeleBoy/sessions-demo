package co.gc.sessionsdemo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.gc.sessionsdemo.model.UserPreferences;

@Controller
public class SessionController {

	@Autowired
	private HttpSession sesh;

	@RequestMapping("/session")
	public ModelAndView showSession(
			@SessionAttribute(name = "preferences", required = false) UserPreferences userPref) {

		ModelAndView mav = new ModelAndView("sessions");

		if (userPref != null) {
			mav.addObject("theme", userPref.getTheme());
		}

//		UserPreferences pref = (UserPreferences) sesh.getAttribute("userPref");
//		mav.addObject("name", pref.getName());

		mav.addObject("sessionID", sesh.getId());
		return mav;

	}

	@PostMapping("/session")
	public ModelAndView setPreferences(UserPreferences pref) {

		sesh.setAttribute("preferences", pref);

		return new ModelAndView("redirect:/session");

	}

}
