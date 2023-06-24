package com.mydemo.utils;

public class Utility {
    public static String transformToEnumName(String name){
        return name.toUpperCase().replace(" ", "_").replace("-", "").
                replace("()", "").replace(".", "");
    }
}
