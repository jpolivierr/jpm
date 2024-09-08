package com.appvenir.utils;


public class PackageNameUtil {

    public static boolean isValidpackageName(String name)
    {
        String regex = "^[a-zA-Z]+(\\.[a-zA-Z][a-zA-Z0-9]*)*$";
        return name.matches(regex);
    }

    public static String getBasePackage(String packageName) {
        if (packageName == null || packageName.isEmpty()) {
            return packageName;
        }

        String[] segments = packageName.split("\\.");

        if (segments.length == 1) {
            return packageName;
        }

        StringBuilder basePackage = new StringBuilder();
        for (int i = 0; i < segments.length - 1; i++) {
            basePackage.append(segments[i]);
            if (i < segments.length - 2) {
                basePackage.append(".");
            }
        }

        return basePackage.toString();
    }
    
}
