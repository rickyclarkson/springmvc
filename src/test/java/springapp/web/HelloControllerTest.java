package springapp.web;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTest extends TestCase {
	public void testHandleRequestView() {
		HelloController controller = new HelloController();
		ModelAndView modelAndview = controller.handleRequest(null, null);
		assertEquals("hello.jsp", modelAndview.getViewName());
	}
}
