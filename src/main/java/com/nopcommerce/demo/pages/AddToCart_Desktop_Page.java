package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class AddToCart_Desktop_Page extends Utility {
    // creating object of the below class so can call the method
   public Computer_DesktopPage computer_desktopPageObj= new Computer_DesktopPage();
    public By addToCart= By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    public By sortBy = By.xpath("//select[@id='products-orderby']");
    //By addToCart = By.xpath("//h2[@class='product-title']//a[@href='/build-your-own-computer']");

    public void sortBy_clickOnAddToCart_Desktop(String text){
        //before we sort out the items we have to be on that page
        // so we have created the object of the class and called the method here
        computer_desktopPageObj.clickOnComputerDesktop();
        selectByContainsTextFromDropDown(sortBy,text);
       // waitUntilVisibilityOfElementLocated(addToCart,20);
        mouseHoverToElementAndClick(addToCart);




    }

}
