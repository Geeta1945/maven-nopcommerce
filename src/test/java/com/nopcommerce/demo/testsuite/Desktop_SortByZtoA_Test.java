package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Desktop_SortByZtoA_Page;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class Desktop_SortByZtoA_Test extends TestBase {

    Desktop_SortByZtoA_Page zToAObj = new Desktop_SortByZtoA_Page();
    Computer_DesktopTest computer_desktopTestObj = new Computer_DesktopTest();

    @Test

    public void sortByZtoA() {

    computer_desktopTestObj.clickOnComputerDesktop();

        zToAObj.sortBy("Name: Z to A");

    }
}
