package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.AddToCart_Desktop_Page;
import com.nopcommerce.demo.pages.Desktop_SortByZtoA_Page;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class AddToCart_Desktop_Test extends TestBase {

   public AddToCart_Desktop_Page addToCartObj = new AddToCart_Desktop_Page();

    @Test

    public void clickOnAddToCartBuildYourOwnComputer(){

       addToCartObj.sortBy_clickOnAddToCart_Desktop("Name: A to Z");
    }

}
