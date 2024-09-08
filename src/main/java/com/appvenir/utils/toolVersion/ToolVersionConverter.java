package com.appvenir.utils.toolVersion;

import picocli.CommandLine.ITypeConverter;
import picocli.CommandLine.ParameterException;

public class ToolVersionConverter implements ITypeConverter<ToolVersion> {

    private final String defaultVersion;

    public ToolVersionConverter(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    @Override
    public ToolVersion convert(String value) throws Exception {

        if (value.contains(":")) {
            String[] parts = value.split(":");
            String toolName = parts[0];
            String version = parts.length == 2 ? parts[1] : "";
            
            if (version.isEmpty()) {
                throw new ParameterException(null, "Version is missing after '" + toolName + ":'");
            }
            return new ToolVersion(toolName, version);
        } else {
            // If only "tool-name" is provided, use the default version
            return new ToolVersion(value, defaultVersion);
        }
    }
}

