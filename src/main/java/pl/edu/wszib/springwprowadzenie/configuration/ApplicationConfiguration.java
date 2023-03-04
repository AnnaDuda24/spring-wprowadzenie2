package pl.edu.wszib.springwprowadzenie.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableConfigurationProperties(MojeProperties.class)
public class ApplicationConfiguration {
}
