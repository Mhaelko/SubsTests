package com.academy.project.page;

import com.academy.core.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscribersPage extends BasePage {

    public SubscribersPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//div/table")
    private WebElement table;

    public String findEl(){
        return table.findElement(By.xpath("//tr/td/input[@id='1']/../../td[3]")).getText();

    }

    public SubscribersPage goToPage(){
        driver.get("http://localhost:8081/subscribers");
        return this;
    }
}
