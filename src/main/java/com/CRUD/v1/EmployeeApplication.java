package com.CRUD.v1;

import com.CRUD.v1.employee.Employee;
import com.CRUD.v1.repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
public CommandLineRunner loadData(EmployeeRepository repository) {
    return (args) -> {
        // save a couple of Employees
        repository.save(new Employee("Jack Bronzer", "Biology", "jbronzer@gmail.com", 19));
        repository.save(new Employee("Chloe Gazer", "Computer Science", "cgazer@outlook.com", 22));
        repository.save(new Employee("Kim Darin", "Chemistry", "kdarin@hotmail.com", 30));
		repository.save(new Employee("James Fraud", "Biochemistry", "jfraud@gmail.com", 25));
		repository.save(new Employee("Don Hitman", "Psycology", "dhitman@gmail.com", 21));
		repository.save(new Employee("Foley Cakes", "Music", "fcakes@gmail.com", 25));
		repository.save(new Employee("Jamie Foster", "Sciences", "jfoster@gmail.com", 35));
		repository.save(new Employee("Henry Tuesday", "Business", "htuesday@outlook.com", 24));
};

}
}
