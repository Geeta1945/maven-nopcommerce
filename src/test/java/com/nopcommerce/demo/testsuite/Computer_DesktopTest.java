package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computer_DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Computer_DesktopTest extends TestBase {
    Computer_DesktopPage computer_desktopPageObj = new Computer_DesktopPage();


    @Test

    public void clickOnComputerDesktop(){
    computer_desktopPageObj.clickOnComputerDesktop();


    }
}
