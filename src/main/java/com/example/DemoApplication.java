package com.example;

import javax.xml.ws.ResponseWrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;


@Controller
@EnableAutoConfiguration
public class DemoApplication {
	@RequestMapping("/")
    @ResponseWrapper
	String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
    }
	
}
