package com.spartaglobal.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
    private WebDriver driver;

    public void selector(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/selectable/");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        WebElement element;
        Actions builder = new Actions(driver);
        for(int i=1;i<8;i++){
            element = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[" + i + "]"));
            System.out.println(element.getText());
            builder.moveToElement(element).click().perform();
        }
    }
}
