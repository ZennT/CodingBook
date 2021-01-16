package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodingBookMainPage {
    private final WebDriver driver;
    private WebElement webElementLogo;

    public CodingBookMainPage(WebDriver driver){
        this.driver = driver;
        this.driver.get("https://codingbook.org/");
        webElementLogo = driver.findElement(By.xpath("//img[@class='custom-logo']"));
    }
    public WebElement getWebElementLogo(){ return webElementLogo;}
}
