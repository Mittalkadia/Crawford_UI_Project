package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Utils extends BasePage{
    //method to  get text
    public static String get_Text_From_Element(By by) {
        return driver.findElement(by).getText();
    }
    public void assertCurrentURL(String url) {
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
    }
}
