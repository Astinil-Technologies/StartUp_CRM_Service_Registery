package startup.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartUpCrmServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartUpCrmServiceRegistryApplication.class, args);
	}

}
