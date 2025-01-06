package com.example.Login.exclude;

import com.example.Login.userSchedular.LogShedular;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.example.Login.userSchedular",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = {LogShedular.class}
        )
)
public class AppConfig {
    // Additional bean definitions can go here if needed
}