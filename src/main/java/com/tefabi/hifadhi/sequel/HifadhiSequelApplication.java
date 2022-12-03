package com.tefabi.hifadhi.sequel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})
public class HifadhiSequelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HifadhiSequelApplication.class, args);
	}

}
