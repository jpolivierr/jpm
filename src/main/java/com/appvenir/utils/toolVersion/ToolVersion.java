package com.appvenir.utils.toolVersion;

public class ToolVersion {
    private String toolName;
    private String version;

    public ToolVersion(String toolName, String version) {
        this.toolName = toolName;
        this.version = version;
    }

    public String getToolName() {
        return toolName;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return toolName + " version: " + version;
    }
}

