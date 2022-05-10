package nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetails {
	
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]/option[101]")
	public static WebElement country;
	
	@FindBy(id="BillingNewAddress_City")
	public static WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	public static WebElement address;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public static WebElement zipcode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	public static WebElement phonenumber;
	
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
	public static WebElement con1;
	
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
	public static WebElement con2;
	
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
	public static WebElement payment;
	
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
	public static WebElement con3;
	
	@FindBy(xpath = "//*[@id=\"shopping-cart-form\"]/div[3]/div/div/table/tbody/tr[5]/td[2]/span")
	public static WebElement earn;
	
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
	public static WebElement con4;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[1]/strong")
	public static WebElement order;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button")
	public static WebElement con5;
	
	

}
