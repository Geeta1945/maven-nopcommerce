package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computer_DesktopPage extends Utility {



 public By computer = By.xpath("//ul[@class= 'top-menu notmobile']/li[1]");
 public By desktop = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");

 public void clickOnComputerDesktop(){
  mouseHoverToElement(computer);
  //waitUntilVisibilityOfElementLocated(computer,10);

 mouseHoverToElementAndClick(desktop);

 }


}
