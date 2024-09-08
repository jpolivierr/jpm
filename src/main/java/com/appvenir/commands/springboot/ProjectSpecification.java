package com.appvenir.commands.springboot;

import lombok.Data;

@Data
public class ProjectSpecification {
    private String language;
    private String bootVersion;
    private String baseDir;
    private String groupId;
    private String artifactId;
    private String name;
    private String description;
    private String packageName;
    private String packaging;
    private String javaVersion;
    private String dependencies;
}
