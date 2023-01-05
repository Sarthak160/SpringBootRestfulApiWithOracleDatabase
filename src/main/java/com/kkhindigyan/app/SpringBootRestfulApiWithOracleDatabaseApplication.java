package com.kkhindigyan.app;

import io.keploy.ksql.KDriver;
import io.keploy.ksql.KResultSet;
import io.keploy.servlet.KeployMiddleware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(KeployMiddleware.class)
public class SpringBootRestfulApiWithOracleDatabaseApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootRestfulApiWithOracleDatabaseApplication.class, args);
	}
}
