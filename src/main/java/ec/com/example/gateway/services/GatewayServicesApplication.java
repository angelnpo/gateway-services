package ec.com.example.gateway.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Boot application.
 *
 * @author Angel Cuenca
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServicesApplication {

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(GatewayServicesApplication.class, args);
    }

}
