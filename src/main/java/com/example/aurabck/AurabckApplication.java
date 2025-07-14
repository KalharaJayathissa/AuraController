package com.example.aurabck;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AurabckApplication {

    public static void main(String[] args) {
        SpringApplication.run(AurabckApplication.class, args);

    }

    @Bean // This tells Spring to create an instance of ModelMapper and make it available for @Autowired
    public ModelMapper modelMapper() {
        return new ModelMapper(); // This line creates the ModelMapper object
    }

}
