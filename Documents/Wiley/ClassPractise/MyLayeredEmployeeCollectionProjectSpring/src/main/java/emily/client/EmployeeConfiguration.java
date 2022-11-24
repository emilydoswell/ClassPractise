package emily.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"persistence", "service", "presentation"})
public class EmployeeConfiguration {
}
