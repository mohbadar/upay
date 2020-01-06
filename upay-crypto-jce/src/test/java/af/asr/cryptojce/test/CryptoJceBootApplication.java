package af.asr.cryptojce.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "af.asr.*" })
public class CryptoJceBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(CryptoJceBootApplication.class, args);

	}

}
