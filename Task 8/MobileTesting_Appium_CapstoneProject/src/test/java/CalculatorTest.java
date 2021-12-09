
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class CalculatorTest {
	
	public static void scroll(AndroidDriver<WebElement> driver)
	{
		  TouchAction  action =new TouchAction(driver);	
		  Dimension size	=driver.manage().window().getSize();
		  int start_x=(int) (size.width*.5);
		  int start_y=(int) (size.height*.5);	
		  
		  int end_x=(int) (size.width*.5);
		  int end_y=(int) (size.height*.3);
		  				
		  action.press(PointOption.point(start_x, start_y))
		  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		  .moveTo(PointOption.point(end_x, end_y)).release().perform();
	}
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");//Version is number here
dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A7");
//dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\heman\\Downloads\\selendroid-test-app-0.17.0.apk");
URL url = new URL("http://127.0.0.1:4723/wd/hub");
AndroidDriver<WebElement> driver = new AndroidDriver<WebElement> (url, dc);
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[8]").click();
Thread.sleep(3000);
driver.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("Play games");
System.out.println("Typing in search bar");
Thread.sleep(2000);
driver.findElementById("io.selendroid.testapp:id/input_adds_check_box").click();
System.out.println("Removed the check on item");
driver.findElementById("io.selendroid.testapp:id/input_adds_check_box").click();
System.out.println("checked on item again");
Thread.sleep(2000);
driver.findElementByXPath("//android.widget.Button[@content-desc=\"showToastButtonCD\"]").click();
System.out.println("say hello selendroid");
Thread.sleep(2000);
driver.findElementById("io.selendroid.testapp:id/startUserRegistration").click();
Thread.sleep(2000);
driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Hello world");
Thread.sleep(1000);
driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("Helloworld@gmail.com");
Thread.sleep(1000);
driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("Helloworld@gmail.com");
Thread.sleep(1000);
driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
Thread.sleep(1000);
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[4]").click();
System.out.println("Selected python");
Thread.sleep(2000);
scroll(driver);


driver.findElementById("io.selendroid.testapp:id/input_adds").click();
Thread.sleep(1000);
driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").click();
Thread.sleep(1000);
driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").click();


/*AndroidElement list=(AndroidElement)driver.findElementById("io.selendroid.testapp:id/input_adds");
System.out.println("Trying to scroll");
Thread.sleep(5000);


MobileElement listitem = (MobileElement) driver.findElement(
MobileBy.AndroidUIAutomator(
		"new UiScrollable(new Viselector()).scrollintoView("
				+ "new UiSelector().description(\"I accept adds\"));"));
System.out.println(listitem.getLocation());
listitem.click();*/



}
}
