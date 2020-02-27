package co.gc.sessionsdemo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.sessionsdemo.model.UserPreferences;

@Controller

public class CookieController {

	@Autowired
	private HttpServletResponse response;

	@RequestMapping("/cookie")
	public ModelAndView showCount(@CookieValue(name = "count", required = false) String cookie) {

		ModelAndView mav = new ModelAndView("cookies");

		mav.addObject("cookieCount", cookie);

		return mav;

	}

	@RequestMapping("/cookie/add")
	public ModelAndView addCookie(@CookieValue(name = "count", defaultValue = "0") Integer oldCount) {

		Integer newCount = oldCount + 1;

		// Cookies have a name and a value
		// we're calling this one count and storing a value integer into it
		Cookie cookie = new Cookie("count", String.valueOf(newCount));

		// this is how you set the lifetime of the cookie
		cookie.setMaxAge(30);

		response.addCookie(cookie);

		return new ModelAndView("redirect:/cookie");

	}

	@RequestMapping("/cookie/clear")
	public String clear() {
		Cookie cookie = new Cookie("count", "");
		cookie.setMaxAge(0);

		response.addCookie(cookie);
		return ("redirect:/cookie");

	}
	


}
