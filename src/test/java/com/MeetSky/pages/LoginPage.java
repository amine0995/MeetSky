package com.MeetSky.pages;



import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="user")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement passWord;

    @FindBy(id = "submit-form")
    public WebElement submit;


    public void login(String usernameStr, String passwordStr) {

        userName.sendKeys(usernameStr);
        passWord.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }
    //BREAK UNTIL 12:10

}
