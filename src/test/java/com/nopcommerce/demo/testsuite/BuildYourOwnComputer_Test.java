package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.AddToCart_Desktop_Page;
import com.nopcommerce.demo.pages.BuildYourOwnComputer_Page;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BuildYourOwnComputer_Test extends TestBase {
    AddToCart_Desktop_Page addToCartObj= new AddToCart_Desktop_Page();
    BuildYourOwnComputer_Page buildYourOwnComputer_pageObj = new BuildYourOwnComputer_Page();
    private TimeUnit thread;

    @Test
    public void letsBuildYourOwnComputer() throws InterruptedException {
        /*
        2.1 Click on Computer Menu.
	    2.2 Click on Desktop
	    2.3 Select Sort By position "Name: A to Z"
	    2.4 Click on "Add To Cart"
         */
        buildYourOwnComputer_pageObj.buildYourComputer();

        //addToCartObj.sortBy_clickOnAddToCart_Desktop("Name: A to Z");
        Thread.sleep(2000);

        String actualMessage = buildYourOwnComputer_pageObj.getTitle();
        System.out.println(actualMessage);
        Thread.sleep(2000);

        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(actualMessage, "Build your own computer");
        Thread.sleep(1000);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer_pageObj.selectProcessorDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(1000);

        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer_pageObj.selectRamDropDown("8GB [+$60.00]");
        Thread.sleep(1000);

        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer_pageObj.selectHddRadioButton();
        Thread.sleep(1000);

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer_pageObj.selectOsRadioButton();
        Thread.sleep(1000);

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputer_pageObj.selectOfficeAndCommanderRadioButton();
        Thread.sleep(2000);

        //2.11 Verify the price "$1,475.00"
        String actualTotal= buildYourOwnComputer_pageObj.getTotalAmount();
        System.out.println(actualTotal);
        String expectedTotal ="$1,475.00";

        Thread.sleep(2000);

       Assert.assertEquals(actualTotal,expectedTotal);



    }
}
