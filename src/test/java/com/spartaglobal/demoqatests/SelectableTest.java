package com.spartaglobal.demoqatests;

import com.spartaglobal.demoqa.Selectable;
import com.spartaglobal.demoqa.Sortable;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectableTest {
    private static Selectable selectable;


    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        selectable = new Selectable();
    }

    @Test
    public void selectableTest(){
        selectable.selector();
    }
}
