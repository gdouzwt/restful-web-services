package io.zwt.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//method - "Hello World
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		throw new RuntimeException("Some Error has Happened! Contact Support at ***_***");
//		return new HelloWorldBean(String.format("Hello World, %s", "Awesome!"));
	}
}
