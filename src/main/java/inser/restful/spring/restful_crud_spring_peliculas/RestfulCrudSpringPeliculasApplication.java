package inser.restful.spring.restful_crud_spring_peliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestfulCrudSpringPeliculasApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RestfulCrudSpringPeliculasApplication.class, args);
	}

        @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder 
        application) {
		return application.sources(RestfulCrudSpringPeliculasApplication.class);
	}
}
