package com.example.hibernate;

import com.example.hibernate.model.Contact;
import com.example.hibernate.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.SchemaOutputResolver;
import java.util.stream.LongStream;

@SpringBootApplication
public class ExampleHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleHibernateApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ContactRepository repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11)
					.mapToObj(i -> {
						Contact c = new Contact();
						c.setName("Contact " + i);
						c.setEmail("Contact " + i + "@gmail.com");
						c.setPhone("(16) 91616-1616");
						return c;
					})
					.map(v -> repository.save(v))
					.forEach(System.out::println);
		};
	}
}
