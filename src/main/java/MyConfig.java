import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	
	@Bean(name ="serviceObject")
	public Msgservice getMsgservice()
	{
		
		return new MsgServiceImpl();
	}
}
