package com.castro;

import com.castro.domain.Post;
import com.castro.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NoteitApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteitApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(PostRepository repository) {
		return (args) -> {
			repository.save(new Post("first post"));
			repository.save(new Post("second post"));
			repository.save(new Post("third post"));
		};
	}
}

