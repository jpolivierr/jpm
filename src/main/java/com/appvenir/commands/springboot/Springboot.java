package com.appvenir.commands.springboot;

import java.util.Arrays;

import com.appvenir.config.springBootConfig.SpringBootConfig;
import com.appvenir.exceptions.InvalidPackageName;
import com.appvenir.utils.PackageNameUtil;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
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

    @Option(names = {"-l", "--language"},
            defaultValue = "java",
            description = "Choose from either: Java, Kotlin or Groovy"
            )
    private String language;

    @Option(names = {"-v", "--version"},
            description = "Specify a spring boot version"
            )        
    private String bootVersion;

    @Option(names = {"-d", "--directory"},
            description = "Project root directory name"
            )        
    private String baseDirName;

    private String groupId;



    @Override
    public void run() {

        SpringBootConfig springBootConfig = SpringBootConfig.getSpringBootConfig();

        if(!PackageNameUtil.isValidpackageName(this.packageName))
            throw new InvalidPackageName();

        if(bootVersion == null || bootVersion.isEmpty())
            bootVersion = springBootConfig.getVERSION();

        if (baseDirName == null || baseDirName.isEmpty()) {
            String[] splitPackageName = packageName.split("\\."); 
            baseDirName = Arrays.asList(splitPackageName).get(splitPackageName.length - 1);
        }
        
        this.groupId = PackageNameUtil.getBasePackage(packageName);
                    

        System.out.println("Package Name: " + packageName);
        System.out.println("language: " + language);
        System.out.println("bootVersion: " + bootVersion);
        System.out.println("baseDir: " + baseDirName);
        System.out.println("groupId: " + groupId);
    }
    
}
