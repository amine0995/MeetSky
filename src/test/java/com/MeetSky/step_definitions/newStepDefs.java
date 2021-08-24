package com.MeetSky.step_definitions;

import com.MeetSky.pages.FolderPage;
import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class newStepDefs {
    FolderPage folderPage=new FolderPage();
    List<WebElement> sizeColumns = folderPage.sizeColumn;
    List<String> actualSizeOrder= new ArrayList<>();

    @When("the user check the order by size")
    public void theUserCheckTheOrderBySize() {

       
      
        BrowserUtils.waitFor(3);

        for (WebElement sizeColumn : sizeColumns) {

            actualSizeOrder.add(sizeColumn.getText());

        }

        System.out.println("actualSizeOrder = " + actualSizeOrder);

//        System.out.println("Driver.get().findElement(By.xpath(\"//tr[@data-id='10205']\")).getText() = " + Driver.get().findElement(By.xpath("//tr[@data-id='10205']")).getText());
//        BrowserUtils.waitFor(1);

    }


    @And("the user see new order by size column")
    public void theUserSeeNewOrderBySizeColumn() {
        
        BrowserUtils.waitFor(3);
        List<String> newSizeColumn= new ArrayList<>();

        for (WebElement sizeColumn : sizeColumns) {
            newSizeColumn.add(sizeColumn.getText());
        }

        System.out.println("newSizeColumn = " + newSizeColumn);

        Assert.assertFalse("file order changed by size",newSizeColumn.equals(actualSizeOrder));



    }
}
