package com.agileteach.seleniumtutorials;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTesting {

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\webdriversrc\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.facebook.com");

    //driver.quit();

    }
}
