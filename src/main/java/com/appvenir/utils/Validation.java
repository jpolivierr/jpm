package com.appvenir.utils;


public class Validation {

    public static boolean isValidpackageName(String name)
    {
        String regex = "^[a-zA-Z]+(\\.[a-zA-Z][a-zA-Z0-9]*)*$";
        return name.matches(regex);
    }
    
}
