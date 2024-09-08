package com.appvenir.commands.springboot;

import com.appvenir.exceptions.InvalidPackageName;
import com.appvenir.utils.Validation;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
    name = "spring-boot",
    description = "Create a spring boot project."
    )
public class Springboot implements Runnable{

    @Parameters(
        index="0",
        description="Main package name"
    )
    private String packageName;

    @Override
    public void run() {
        
        if(!Validation.isValidpackageName(this.packageName))
            throw new InvalidPackageName();

        System.out.println("Package Name: " + packageName);
    }
    
}
