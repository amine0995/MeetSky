package com.MeetSky.pages;

import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderPage {
    public FolderPage() {
        PageFactory.initElements(Driver.get(), this); }

    //tbody/tr[3]/td[2]



    @FindBy(xpath = "//tr//span[@class='innernametext']")
    public List<WebElement>  NameBtn;


    @FindBy(xpath = "//span[text()='Name']")
    public WebElement NameOption;

    @FindBy(xpath = "//span[text()='Size']")
    public WebElement SizeBtn;

    @FindBy(xpath="//tbody/tr[1]")
    public WebElement FirstRow;
    @FindBy(xpath="//tbody/tr[2]")
    public WebElement SecondRow;
    @FindBy(xpath="//tbody/tr[3]")
    public WebElement ThirdRow;
    @FindBy(xpath="//tbody/tr[4]")
    public WebElement FourthRow;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public  List<WebElement>  sizeColumn;

}
