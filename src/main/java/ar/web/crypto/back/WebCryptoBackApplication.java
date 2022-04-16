package ar.web.crypto.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@SpringBootApplication
@ComponentScan({"ar.web.crypto.back"})
@PropertySource("classpath:application.properties")
public class WebCryptoBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebCryptoBackApplication.class, args);
    }

}
