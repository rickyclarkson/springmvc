package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springapp.web.service.HelloService;

@Controller
public class HelloController {
	protected final Log logger = LogFactory.getLog(getClass());

	private final HelloService service;

	@Autowired
	public HelloController(HelloService service) {
		this.service = service;
	}

	@RequestMapping(value="/hello.htm", method= RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Returning hello view");
		System.out.println("stdout - Returning hello view");
		final ModelAndView modelAndView = new ModelAndView("hello.jsp");
		modelAndView.addObject("greeting", service.sayHello("User"));
		return modelAndView;
	}
}
