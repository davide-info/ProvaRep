import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyConfig;
import repositories.ProductRepository;

public class ProvaMainSpring {
public static void main(String[] args) {
	try(var context = new AnnotationConfigApplicationContext(MyConfig.class)) {
		var repository =context.getBean(ProductRepository.class);
		System.out.println(repository.getProducts());
		
	}
}
}
