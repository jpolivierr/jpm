package com.appvenir.config.springBootConfig;

import lombok.Getter;

@Getter
public class SpringBootConfig {

    private static SpringBootConfig instance;
    public String URL = "https://start.spring.io/starter.zip";
    public String VERSION = "3.3.3";

    private SpringBootConfig(){}


    public static SpringBootConfig getSpringBootConfig()
    {
        if(instance == null)
            return new SpringBootConfig();

        return instance;
    }
    
}
