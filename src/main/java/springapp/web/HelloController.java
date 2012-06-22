package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value="/hello.htm", method= RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Returning hello view");
		System.out.println("stdout - Returning hello view");
		return new ModelAndView("hello.jsp");
	}
}
