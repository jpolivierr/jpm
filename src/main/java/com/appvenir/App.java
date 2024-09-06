package com.appvenir;

import com.appvenir.commands.springboot.Springboot;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "JPM", 
    description = "JPM (Java Project Manager) is a powerful CLI tool designed to streamline the creation and management of Java-based applications. It simplifies project setup, dependency management, and build processes, helping developers efficiently handle their Java projects from start to finish.",
    subcommands = { Springboot.class }
)
public class App implements Runnable
{
    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println("This is the main CLI application");
    }

}
