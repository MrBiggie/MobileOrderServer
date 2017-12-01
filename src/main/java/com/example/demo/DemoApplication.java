package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//You can ignore these error. Combination of create-drop and in-memory database produces these for every database object it tries to drop.
		//Reason being that there is not any database objects to remove - DROP statements are executed against empty database.
		//Also with normal permanent database such a errors do come,
		//because Hibernate does not figure out before executing DROP statements does added object exist in database or is it new.
	}
}
