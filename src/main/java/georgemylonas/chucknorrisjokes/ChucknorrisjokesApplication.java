package georgemylonas.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ChuckConfig.xml")
public class ChucknorrisjokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisjokesApplication.class, args);
	}
}
