package pl.edu.wszib.springwprowadzenie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import pl.edu.wszib.springwprowadzenie.configuration.MojeProperties;

@SpringBootApplication
public class SpringWprowadzenieApplication implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext context;
    private static final Logger logger = LoggerFactory.getLogger(SpringWprowadzenieApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringWprowadzenieApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Autowired
    private MojeProperties mojeProperties;
}
