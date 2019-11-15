package com.spartaglobal.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

    private WebDriver driver;

    public void droppable(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().setSize(new Dimension(1334, 728));
        {
            WebElement element = driver.findElement(By.id("draggable"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
            builder.moveByOffset(150, 0).perform();
            builder.moveToElement(element).release().perform();

        }
    }
}
