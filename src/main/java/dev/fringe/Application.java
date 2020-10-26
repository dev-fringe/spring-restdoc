package dev.fringe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    
    @RestController
    public class TestController {

    	@GetMapping("/index")
    	public @ResponseBody Object index() {
    		return "hello world. rest.";
    	}

    }
}
