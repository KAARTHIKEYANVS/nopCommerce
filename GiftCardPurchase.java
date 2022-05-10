package nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPurchase {
	
	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
	public static WebElement close;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[7]/a")
	public static WebElement giftcard;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")
	public static WebElement phyCard;
	
	@FindBy(xpath = "//*[@id=\"giftcard_45_RecipientName\"]")
	public static WebElement recipientname;
	
	@FindBy(xpath = "//*[@id=\"giftcard_45_SenderName\"]")
	public static WebElement sendername;
	
	@FindBy(xpath = "//*[@id=\"product_enteredQuantity_45\"]")
	public static WebElement quantity;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button-45\"]")
	public static WebElement cart;
	
	

}
