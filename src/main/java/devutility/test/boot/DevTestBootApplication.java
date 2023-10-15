package devutility.test.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import devutility.test.boot.common.DTBConfiguration;

@Import(DTBConfiguration.class)
@SpringBootApplication
public class DevTestBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevTestBootApplication.class, args);
		System.out.println("Starting DevTestBootApplication successfully...");
	}
}