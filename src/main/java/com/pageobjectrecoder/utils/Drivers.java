package com.pageobjectrecoder.utils;

import com.pageobjectrecoder.ui.Recorder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Drivers {
    private static final int PAGE_TIME_OUT = 30;
    static WebDriver driver =null;
    static JavascriptExecutor js=null;


    public void driver_init(String browser,String url){

         switch (browser.toLowerCase()) {
            case "chrome":
               chrome();
                break;
            case "firefox":
               // firefox();
                break;

            case "ie11":
               // ie11();
                break;

            case "edge":
                JOptionPane.showMessageDialog(null, "Does not find Driver", "Warning" , JOptionPane.INFORMATION_MESSAGE);
                break;

            default:

                break;
        }

        driver.manage().timeouts().implicitlyWait(PAGE_TIME_OUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_TIME_OUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        GlobalConstants.driver=driver;
        js=((JavascriptExecutor) driver);

        try {
            driver.get(url);
            Thread.sleep(30);
        } catch (Exception e){
            e.printStackTrace();
        }


    }
   static String docPath = System.getProperty("user.home");

    public void chrome(){
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");

            URL url = this.getClass().getClassLoader().getResource("/drivers");
            System.out.println("drivers path::" + url.toURI());
            System.setProperty("webdriver.chrome.driver", url.toURI().toString() + File.separator + "chromedriver.exe");
            driver = new ChromeDriver(options);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

//    public static void firefox(){
//        System.setProperty("webdriver.gecko.driver", Generic.readConfigProp()+File.separator+"geckodriver.exe");
//        driver = new FirefoxDriver();
//    }
//
//    public static void ie11(){
//        System.setProperty("webdriver.ie.driver", Generic.readConfigProp()+File.separator+"IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//    }


    public static void stop(){
        driver.quit();
    }



    public void excuteScript(){
        int rows = Recorder.model.getRowCount();
        String rowVal=null;

        for(int k=0;k<=rows-1;k++){
           // rowVal = (String) Recorder.model.getValueAt(k, );
        }
    }

}
