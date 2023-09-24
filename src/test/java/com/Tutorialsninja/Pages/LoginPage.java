package com.Tutorialsninja.Pages;

import com.Tutorialsninja.Utilities.BaseTest;
import com.Tutorialsninja.Utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    public WebElement myAccountButton;

    @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    public WebElement loginButton;

    @FindBy(id="input-email")
    public WebElement email;

    @FindBy(id="input-password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    public WebElement button;

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    public WebElement searchBox;

    @FindBy(css = "#search > input")
    public WebElement searchIcon;

    @FindBy(css = "#content h1")
    public WebElement product;






    public void testCasTwo() throws InterruptedException {

        myAccountButton.click();
        Thread.sleep(2000);

        loginButton.click();
        Thread.sleep(2000);

        email.sendKeys(ConfigReader.getProperties("username"));
        password.sendKeys(ConfigReader.getProperties("password"));

        button.click();
        Thread.sleep(2000);


        searchBox.sendKeys(ConfigReader.getProperties("searchBox"));

        searchIcon.click();
        Thread.sleep(2000);


        String expectedProduct="Drone Camera";
        String actualProduct="There is no product that matches the search criteria.";

        Assert.assertNotEquals(expectedProduct,actualProduct,"Product found successfully");



    }

    public void testCase3() throws InterruptedException {

        myAccountButton.click();
        Thread.sleep(2000);

        loginButton.click();
        Thread.sleep(2000);

        email.sendKeys(ConfigReader.getProperties("username"));
        password.sendKeys(ConfigReader.getProperties("password"));

        button.click();
        Thread.sleep(2000);


        searchBox.sendKeys(" ");

        searchIcon.click();
        Thread.sleep(2000);


        String condition="There is no product that matches the search criteria.";

        Assert.assertFalse(Boolean.parseBoolean(condition), "Product found successfully");




    }



}