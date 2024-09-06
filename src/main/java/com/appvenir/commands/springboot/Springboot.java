package com.appvenir.commands.springboot;

import picocli.CommandLine.Command;

@Command(name = "spring-boot")
public class Springboot implements Runnable{

    @Override
    public void run() {
        System.out.println("This is a spring boot project");
    }
    
}
