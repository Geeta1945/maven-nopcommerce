package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Desktop_SortByZtoA_Page extends Utility {

    public By sortBy = By.xpath("//select[@id='products-orderby']");

    public void sortBy(String text){
        selectByContainsTextFromDropDown(sortBy,text);

    }
}





