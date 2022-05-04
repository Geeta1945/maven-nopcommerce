package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;

public class BuildYourOwnComputer_Page extends Utility {
    // creating object of the below class so can call the method
    //AddToCart_Desktop_Page addToCartObj= new AddToCart_Desktop_Page();
    By buildMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");

    By computer = By.xpath("//ul[@class= 'top-menu notmobile']/li[1]");
     By desktop = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");


    By sortBy = By.xpath("//select[@id='products-orderby']");
////body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]
    By addToCart= By.xpath("/body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//label[@for='product_attribute_3_7']");
    By os = By.xpath("//label[@for='product_attribute_4_9']");
    By microsoft_Office= By.xpath("//label[@for='product_attribute_5_10']");
    By total_Commander= By.xpath("//label[@for='product_attribute_4_9']");
    By totalAmount = By.xpath("//span[@id='price-value-1']");

    // we can create one method for clicking all option and call that ONLY ONE method in Test

    public void buildYourComputer(){
        mouseHoverToElement(computer);
        mouseHoverToElementAndClick(desktop);

        selectByContainsTextFromDropDown(sortBy,"Name: A to Z");
        mouseHoverToElementAndClick(addToCart);




       // addToCartObj.sortBy_clickOnAddToCart_Desktop("Name: A to Z");
    }

    public String getTitle() {
        return getTextFromElement(buildMessage);

    }

    public void selectProcessorDropDown(String text){
    selectByContainsTextFromDropDown(processor,text);
    }

    public void selectRamDropDown(String text){
        selectByContainsTextFromDropDown(ram,text);
    }

    public void selectHddRadioButton(){
        clickOnElement(hdd);
    }
    public void selectOsRadioButton(){
        clickOnElement(os);
    }



    public void selectOfficeAndCommanderRadioButton(){
        clickOnElement(microsoft_Office);
        clickOnElement(total_Commander);
    }

    public String getTotalAmount(){


       return getTextFromElement(totalAmount);
    }



}
