package com.pageobjectrecoder.utils;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class GlobalConstants {

    public static String BASE_URL=null;

    public static HashMap<String,String> commandsHashmap=new HashMap<String,String>();

    public static int tblRowno_incrementor=0;

    public static WebDriver driver=null;
}
