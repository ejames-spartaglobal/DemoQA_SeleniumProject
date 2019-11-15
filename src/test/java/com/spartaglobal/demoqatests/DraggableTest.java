package com.spartaglobal.demoqatests;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class DraggableTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
  @Test
  public void draggableTest() {
    driver.get("https://demoqa.com/draggable/");
    driver.manage().window().setSize(new Dimension(1334, 728));
    {
      WebElement element = driver.findElement(By.id("draggable"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
      builder.moveByOffset(100,100).perform();
      builder.moveToElement(element).release().perform();
    }
  }
}
