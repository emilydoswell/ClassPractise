package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import persistence.StudentDaoImpl;
import presentation.StudentPresentationImpl;
import service.StudentServiceImpl;

@Configuration
@ComponentScan(basePackages = {"persistence", "service", "presentation"})
public class StudentConfiguration {

}
