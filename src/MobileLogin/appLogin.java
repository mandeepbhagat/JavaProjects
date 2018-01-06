package MobileLogin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appLogin {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY223PKG9F");
		c.setCapability("platformName", Platform.ANDROID);
		c.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		c.setCapability("app", "G:\\APKs\\Med Helper Pill Reminder_v2.7.7_apkpure.com.apk");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement> (new URL("http://0.0.0.0:4723/wd/hub"), c);
		c.setCapability("apppackage", "");
		c.setCapability("appActivity", "");
		driver.findElementByXPath("//android.widget.button");
		
	}

}
