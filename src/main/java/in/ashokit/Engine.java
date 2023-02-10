package in.ashokit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine ::constructor");
	}
	@PostConstruct
	public void init() {
		System.out.println("startr engine");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("stop engine");
	}
	

}
