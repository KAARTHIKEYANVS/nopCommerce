package nopCommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BasePage {
	@Test

	public void basepage() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\software testing\\files\\driver\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("debuggerAddress", "Localhost:9630");
		WebDriver driver = new ChromeDriver();                       
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Register Form

		PageFactory.initElements(driver, Register.class);
		Register.register.click();
		Register.gender.click();
		Register.firstname.sendKeys("Michel");
		Register.lastname.sendKeys("David");
		Register.day.click();
		Register.month.click();
		Register.year.click();
		Register.email.sendKeys("xzcozpvihdxy@candassociates.com");
		Register.newletter.click();
		Register.password.sendKeys("Asdfgh@2");
		Register.compassword.sendKeys("Asdfgh@2");
		Register.registerbutton.click();
		Register.contue.click();	

		//Login Page

//		PageFactory.initElements(driver, Login.class);
//		Login.loginbu.click();
//		Login.Email.sendKeys("ogrifbifjqrb@candassociates.com");
//		Login.password.sendKeys("Asdfgh@2");
//		Login.login.click();

		//Laptop Purchase

		PageFactory.initElements(driver, ComputerPurchase.class);
		ComputerPurchase.computer.click();
		ComputerPurchase.Notebook.click();
		ComputerPurchase.pro1.click();
		String pro1p = ComputerPurchase.pro1price.getText();
		System.out.println("The Laptop 1 price: " + pro1p);
		Thread.sleep(1000);
		ComputerPurchase.pro2.click();
		String pro2p = ComputerPurchase.pro2price.getText();
		System.out.println("The Laptop 2 price: " + pro2p);
		Thread.sleep(1000);
		ComputerPurchase.pro3.click();
		String pro3p = ComputerPurchase.pro3price.getText();
		System.out.println("The Laptop 3 price: " + pro3p);
		Thread.sleep(1000);

		//Mobile Purchase

		PageFactory.initElements(driver, MobilePurchase.class);
		MobilePurchase.close.click();
		MobilePurchase.electronic.click();
		MobilePurchase.cellphone.click();
		MobilePurchase.pro1.click();
		String pro1p1 = MobilePurchase.pro1price.getText();
		System.out.println("The Mobile price is: " + pro1p1);
		Thread.sleep(1000);
		MobilePurchase.pro2.click();
		String pro2p2 = MobilePurchase.pro2price.getText();
		System.out.println("The Mobile price is: " + pro2p2);
		Thread.sleep(1000);

		//GiftCard Purchase

		PageFactory.initElements(driver, GiftCardPurchase.class);
		GiftCardPurchase.close.click();
		GiftCardPurchase.giftcard.click();
		GiftCardPurchase.phyCard.click();
		GiftCardPurchase.recipientname.sendKeys("david");
		GiftCardPurchase.sendername.sendKeys("Sparten");
		GiftCardPurchase.quantity.clear();
		GiftCardPurchase.quantity.sendKeys("10");
		GiftCardPurchase.cart.click();

		//Camera Purchase

		PageFactory.initElements(driver, CameraPurchase.class);
		CameraPurchase.electrnic.click();
		CameraPurchase.camera.click();
		CameraPurchase.pro.click();
		String pro1s1 = CameraPurchase.proprice.getText();
		System.out.println("The Camera price: " + pro1s1);
		CameraPurchase.pro1.click();

		//Speaker Purchase

		PageFactory.initElements(driver, SpeakerPurchase.class);
		SpeakerPurchase.electronc.click();
		SpeakerPurchase.others.click();
		SpeakerPurchase.pro1.click();
		String pros1p1 = SpeakerPurchase.pro1price.getText();
		System.out.println("The Speaker Price: " + pros1p1);
		SpeakerPurchase.quantity.clear();
		SpeakerPurchase.quantity.sendKeys("2");
		SpeakerPurchase.cart.click();

		//Checkout Page

		PageFactory.initElements(driver, CheckoutPage.class);
		CheckoutPage.checkoutp.click();
		String totalprice = CheckoutPage.totalprice.getText();
		System.out.println("The total Price: " + totalprice);
		CheckoutPage.agree.click();
		CheckoutPage.checkout.click();

		//User Details

		PageFactory.initElements(driver, UserDetails.class);
		UserDetails.country.click();
		UserDetails.city.sendKeys("New York");
		UserDetails.address.sendKeys("Street 8902");
		UserDetails.zipcode.sendKeys("10080");
		UserDetails.phonenumber.sendKeys("8542653245");
		UserDetails.con1.click();
		UserDetails.con2.click();
		UserDetails.payment.click();
		UserDetails.con3.click();
		String earn = UserDetails.earn.getText();
		System.out.println("Earning: " + earn);
		UserDetails.con4.click();
		UserDetails.order.click();
		UserDetails.con5.click();

		//Logout page

		PageFactory.initElements(driver, Logout.class);
		Logout.logout.click();



	}
}
