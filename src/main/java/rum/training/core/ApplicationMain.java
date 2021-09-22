package rum.training.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rum.training.core.service.impl.EmployeeServiceImpl;

public class ApplicationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("rum.training.core");
        EmployeeServiceImpl employeeService = (EmployeeServiceImpl) context.getBean("EmployeeService");
    }
}
