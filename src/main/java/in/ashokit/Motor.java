package in.ashokit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Motor implements InitializingBean,DisposableBean {

		public Motor() {
			System.out.println("motor::Constructor");
	}

		public void destroy() throws Exception {
			System.out.println("destroy() method called");
			
		}

		public void afterPropertiesSet() throws Exception {
			System.out.println("afterPropertiesSet method called");
		}
		
	
	
	

}
