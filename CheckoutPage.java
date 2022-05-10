package nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	
	@FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	public static WebElement checkoutp;
	
	@FindBy(xpath = "//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[1]/table/tbody/tr[4]/td[2]/span/strong")
	public static WebElement totalprice;
	
	@FindBy(xpath = "//*[@id=\"termsofservice\"]")
	public static WebElement agree;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	public static WebElement checkout;

}
