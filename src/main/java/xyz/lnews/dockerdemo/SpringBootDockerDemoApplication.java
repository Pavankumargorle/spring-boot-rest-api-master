package xyz.lnews.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class SpringBootDockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String getHello(){
        return causeNullPointerException();
    }

    private String causeNullPointerException() {
        String nullString = null;
        // The following line will throw a NullPointerException because nullString is null
        return nullString.toUpperCase();
    }
}
