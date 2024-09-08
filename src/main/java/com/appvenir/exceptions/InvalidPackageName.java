package com.appvenir.exceptions;

public class InvalidPackageName extends RuntimeException{
    
    public InvalidPackageName()
    {
        super("Invalid Package name");
    }

}
