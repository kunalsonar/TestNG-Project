package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinpageobject {
public WebDriver driver;

private By username = By.xpath("//input[@id='username']");
private By password = By.xpath("//input[@id='password']");
private By login = By.xpath("//input[@id='Login']");
private By tryForFree= By.xpath("//a[@id='signup_link']");
private By FirstName = By.xpath("//input[@name='UserFirstName']");
private By LastName = By.xpath("//input[@name='UserLastName']");
private By workemail= By.xpath("//input[@name='UserEmail']");
private By jobtitle=By.xpath("//select[@name='UserTitle']");
private By company= By.xpath("//input[@name='CompanyName']");
private By employees=By.xpath("//select[@name='CompanyEmployees']");
private By phoneno=By.xpath("//input[@name='UserPhone']");
private By agrement=By.xpath("//div[@class='checkbox-ui']");


public signinpageobject(WebDriver driver2) {
// TODO Auto-generated constructor stub
this.driver=driver2;
}

public WebElement enterUserName() {
return driver.findElement(username);
}

public WebElement enterPassword() {
return driver.findElement(password);
}

public WebElement clickonLogin() {
return driver.findElement(login);
}
public WebElement opensignuppage() {
return driver.findElement(tryForFree);
}

public WebElement enterfirstname() {
return driver.findElement(FirstName);	
}

public WebElement enterlastname() {
return driver.findElement(LastName);	
}

public WebElement enterworkemail() {
return driver.findElement(workemail);	
}

public WebElement selectjobtitle() {
return driver.findElement(jobtitle);
}

public WebElement selectcompany() {
return driver.findElement(company);
}

public WebElement selectemployee() {
	return driver.findElement(employees);
}


public WebElement enterphone() {
	return driver.findElement(phoneno);
}
public WebElement clickonagrement() {
	return driver.findElement(agrement);
}
}