package rum.training.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rum.training.core.model.Employee;
import rum.training.core.model.Organization;

@Configuration
public class ApplicationConfig {

  @Bean
  public Employee employee() {
    return new Employee();
  }

  @Bean
  public Organization organization() {
    return new Organization();
  }
}
