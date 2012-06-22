package springapp.web;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
	@Test
	public void testHandleRequestView() {
		HelloController controller = new HelloController();
		ModelAndView modelAndview = controller.handleRequest(null, null);
		assertEquals("hello.jsp", modelAndview.getViewName());
	}
}
