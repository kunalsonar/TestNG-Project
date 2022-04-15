package TestCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.signinpageobject;
import resources.baseclass;

public class verifysignin extends baseclass {
@Test
public void enterCredientials() throws InterruptedException {
// driver.findElement(By.xpath("username")).sendKeys("");
signinpageobject spo = new signinpageobject(driver);
spo.enterUserName().sendKeys("kunal");
spo.enterPassword().sendKeys("kunal123");
spo.clickonLogin().click();
Thread.sleep(5000);
spo.opensignuppage().click();
spo.enterfirstname().sendKeys("kunalbhai");
spo.enterlastname().sendKeys("sonar");
spo.enterworkemail().sendKeys("kunal@gmail.com");

Select s1 = new Select(spo.selectjobtitle());
s1.selectByIndex(1);

spo.selectcompany().sendKeys("cognizent");

Select s2= new Select(spo.selectemployee());
s2.selectByIndex(2);

spo.enterphone().sendKeys("9420939316");
spo.clickonagrement().click();

}
}