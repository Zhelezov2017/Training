package rum.training.core.commandlinerunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rum.training.core.dao.EmployeeDao;
import rum.training.core.model.Employee;
import rum.training.core.model.Position;

import java.util.Optional;

@Slf4j
@Configuration
public class CommandLineRunnerImpl {

    @Bean
    public CommandLineRunner demo(EmployeeDao repository) {
        return (args) -> {
            Position position1 = new Position();
            position1.setId(1L);
            position1.setName("Junior");

            Position position2 = new Position();
            position2.setId(2L);
            position2.setName("Middle");
            // save a few employees
            repository.save(new Employee(1L, "Jack", position1));
            repository.save(new Employee(2L, "Chloe", position1));
            repository.save(new Employee(3L, "Kim", position2));
            repository.save(new Employee(4L, "David", position2));
            repository.save(new Employee(5L, "Michelle", position2));

            // fetch all Employees
            log.info("Employees found with findAll():");
            log.info("-------------------------------");
            for (Employee employee : repository.findAll()) {
                log.info(employee.toString());
            }
            log.info("");

            // fetch an individual employee by ID
            Optional<Employee> employee = repository.findById(1L);
            log.info("Employee found with findById(1L):");
            log.info("--------------------------------");
            log.info(employee.toString());
            log.info("");

            // fetch customers by last name
            log.info("Employee found with findByName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
        };
    }
}
