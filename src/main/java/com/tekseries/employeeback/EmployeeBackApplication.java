package com.tekseries.employeeback;

import com.tekseries.employeeback.entity.Employee;
import com.tekseries.employeeback.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeBackApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeBackApplication.class, args);
    }

    private final EmployeeService employeeService;
    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstname("adam")
                .lastname("doe")
                .email("adamdpe@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstname("sarah")
                .lastname("jane")
                .email("sarahjane@gmail.com")
                .build();
        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
    }
}
