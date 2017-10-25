package archivRest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.expression.ParseException;

import java.io.IOException;

@SpringBootApplication
public class Application {

    @Bean
    CommandLineRunner init() throws IOException, ParseException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Environment env = context.getEnvironment();
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

            }
        };

    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}