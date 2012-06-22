package springapp.web;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import springapp.web.service.HelloServiceImpl;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
	@Test
	public void testHandleRequestView() {
		HelloController controller = new HelloController(new HelloServiceImpl());
		ModelAndView modelAndview = controller.handleRequest(null, null);
		assertEquals("hello.jsp", modelAndview.getViewName());
	}
}
