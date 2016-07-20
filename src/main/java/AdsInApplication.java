import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.text.ParseException;

/**
 * Created by NareshL on 18-07-2016.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.adsIn")
@EnableMongoRepositories({"com.adsIn.data.repository"})
public class AdsInApplication {
    public static void main(String[] args) throws ParseException
    {
        SpringApplication.run(AdsInApplication.class,args);
    }

  }
