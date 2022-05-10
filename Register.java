package nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	@FindBy(xpath = "//*[@class=\"header-links\"]/ul/li/a")
	public static WebElement register;
	
	@FindBy(xpath = "//*[@id=\"gender-male\"]")
	public static WebElement gender;
	
	@FindBy(id="FirstName")
	public static WebElement firstname;
	
	@FindBy(id="LastName")
	public static WebElement lastname;
	
	@FindBy(xpath = "//*[@name='DateOfBirthDay']/option[7]")
	public static WebElement day;
	
	@FindBy(xpath = "//*[@name=\"DateOfBirthMonth\"]/option[4]")
	public static WebElement month;
	
	@FindBy(xpath = "//*[@name=\"DateOfBirthYear\"]/option[88]")
	public static WebElement year;
	
	@FindBy(id="Email")
	public static WebElement email;
	
	@FindBy(id="Newsletter")
	public static WebElement newletter;
	
	@FindBy(id="Password")
	public static WebElement password;
	
	@FindBy(id="ConfirmPassword")
	public static WebElement compassword;
	
	@FindBy(id="register-button")
	public static WebElement registerbutton;
	
	@FindBy(xpath ="//*[@class=\"buttons\"]/a")
	public static WebElement contue;
	
	

}
