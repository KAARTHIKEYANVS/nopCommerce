package nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpeakerPurchase {
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
	public static WebElement electronc;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/h2/a")
	public static WebElement others;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")
	public static WebElement pro1;
	
	@FindBy(xpath = "//*[@id=\"price-value-23\"]")
	public static WebElement pro1price;
	
	@FindBy(xpath = "//*[@id=\"product_enteredQuantity_23\"]")
	public static WebElement quantity;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button-23\"]")
	public static WebElement cart;
	
	

}
