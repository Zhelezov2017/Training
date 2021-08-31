package rum.training.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rum.training.core.config.ApplicationConfig;
import rum.training.core.model.Employee;

public class ApplicationMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();
        var employee = context.getBean(Employee.class);
        employee.setId(12L);
        System.out.println(employee.getId());
    }
}
