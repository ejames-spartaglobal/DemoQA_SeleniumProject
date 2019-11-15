package com.spartaglobal.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

    private WebDriver driver;

    public void resizer(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/resizable/");
        WebElement element = driver.findElement(By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).clickAndHold().perform();
        builder.moveByOffset(150, 200).perform();
        builder.moveToElement(element).release().perform();


    }

}
