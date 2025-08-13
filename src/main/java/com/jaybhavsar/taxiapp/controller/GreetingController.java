package com.jaybhavsar.taxiapp.controller;

import com.jaybhavsar.taxiapp.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";

	private final AtomicLong counter = new AtomicLong();

	List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 6);

	@GetMapping("/getstr")
	public List<Integer> getString() {
		return list.stream().map(n -> n * 2).toList();
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
