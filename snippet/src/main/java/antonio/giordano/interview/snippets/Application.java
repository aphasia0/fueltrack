package antonio.giordano.interview.snippets;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Application implements CommandLineRunner, ApplicationContextAware {

	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MyBean a = context.getBean(MyBean.class);
		MyBean b = context.getBean(MyBean.class);
		a.setName("Jack");
		b.setName("Mouse");
		System.out.println(a.getName());
		System.out.println(b.getName());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	@Bean
	@Scope("prototype")
	public MyBean getMyBean(){
		return new MyBean();
	}
}
