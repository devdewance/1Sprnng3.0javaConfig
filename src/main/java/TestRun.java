import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Msgservice service = (Msgservice)context.getBean("serviceObject");
		
		System.out.println(service.sayHell("PARASHAR"));;
		
		service.msgAcknowledge();
		
		
				
		
	}
}
