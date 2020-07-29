package  ma.zs.generated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GeneratedApplication {

	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) {
		ConfigurableApplicationContext myCtx=SpringApplication.run(GeneratedApplication.class, args);
		ctx=myCtx;
	}

	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SpringApplicationContext springApplicationContext() {
		return new SpringApplicationContext();
	}

	public static ConfigurableApplicationContext getCtx() {
		return ctx;
	}
}
