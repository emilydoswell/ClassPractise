package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.DriverManager;

@Configuration
@ComponentScan(basePackages = {"persistence", "service", "presentation"})

public class BookConfiguration {

}
