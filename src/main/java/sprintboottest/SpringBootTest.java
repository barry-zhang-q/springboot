package sprintboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringBootTest {
	
	@RequestMapping("/index")
    public String test() {
        return "helloworld spring boot";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest.class, args);
	}
}
