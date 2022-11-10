package emily.client;

import emily.entity.Employee;
import emily.persistence.EmployeeDaoImpl;

import emily.presentation.EmployeePresentationImpl;
import emily.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;

public class EmployeeConfiguration {
    @Bean(name = "dao")
    public EmployeeDaoImpl getPersistence() {
        return new EmployeeDaoImpl();
    }

    @Bean(name = "service")
    public EmployeeServiceImpl getEmployeeService() {
        //Constructor Injection
        return new EmployeeServiceImpl(getPersistence());
    }

    @Bean(name = "presentation")
    public EmployeePresentationImpl getPresentation() {
        //Setter Injection
        EmployeePresentationImpl presentation = new EmployeePresentationImpl();
        presentation.setEmployeeService(getEmployeeService());
        return presentation;
    }
}