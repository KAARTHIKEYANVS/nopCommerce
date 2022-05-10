package nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CameraPurchase {
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
	public static WebElement electrnic;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")
	public static WebElement camera;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
	public static WebElement pro;
	
	@FindBy(xpath = "//*[@id=\"price-value-14\"]")
	public static WebElement proprice;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button-14\"]")
	public static WebElement pro1;

}
