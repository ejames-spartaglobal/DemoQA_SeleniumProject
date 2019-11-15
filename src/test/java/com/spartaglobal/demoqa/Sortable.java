package com.spartaglobal.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

    private WebDriver driver;

    public void sorter(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/sortable/");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        WebElement focusElement;
        WebElement element;
        Actions builder = new Actions(driver);
        for(int i=1;i<8;i++){
            element = driver.findElement(By.cssSelector("#sortable > li:nth-child(7)"));
            focusElement = driver.findElement(By.cssSelector("#sortable > li:nth-child("+ i + ")"));
            System.out.println(focusElement.getText());
            System.out.println(element.getText());
            builder.moveToElement(element).clickAndHold().perform();
            builder.moveToElement(focusElement).release().perform();
        }
    }
}
