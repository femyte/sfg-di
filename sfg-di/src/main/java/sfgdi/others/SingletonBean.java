package sfgdi.others;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	public SingletonBean() {
		
		System.out.println("Creating A Singleton Bean !!!!!!!!!!!!!");
	}
	
	public String getBeanScope() {
		return "This is a Singleton";
	}

}
