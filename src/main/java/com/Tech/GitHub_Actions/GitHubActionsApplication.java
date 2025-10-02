package com.Tech.GitHub_Actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsApplication {

    @GetMapping("/home")
    public String greet() {
        return "Hello, GitHub Actions!";
    }

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsApplication.class, args);
	}

}
