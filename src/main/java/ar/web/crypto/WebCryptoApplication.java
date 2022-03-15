package ar.web.crypto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan({"ar.web.crypto"})
@PropertySource("classpath:application.properties")
public class WebCryptoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebCryptoApplication.class, args);
    }

}
