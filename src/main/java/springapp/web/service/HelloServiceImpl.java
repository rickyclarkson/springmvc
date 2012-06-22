package springapp.web.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
	public String sayHello(String to) {
		return "Hello, " + to;
	}
}
