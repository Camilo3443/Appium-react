package br.com.mobile.automation.utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import br.com.mobile.automation.utilities.enums.OS;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AppiumDriver<MobileElement> driver;
	private static AppiumFieldDecorator appiumFieldDecorator;

	public static AppiumFieldDecorator getAppiumFieldDecorator() {
		if (appiumFieldDecorator == null) {
			createDriver();
		}
		return appiumFieldDecorator;
	}

	public static AppiumDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	public static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		switch (BaseConstants.executionOS) {
			case OS.ANDROID:
				File classpathRoot = new File(System.getProperty("user.dir"));
				File appDir = new File(classpathRoot, "/src/test/resources");
				File app = new File(appDir, "app-development-release.apk");

				desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
				desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
				desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
				desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
				desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
				// desiredCapabilities.setCapability("appPackage", BaseConstants.BASE_PACKAGE);
				desiredCapabilities.setCapability("appActivity", BaseConstants.BASE_ACTIVITY);

				try {
					driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
							desiredCapabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}

				break;
			case OS.IOS:
				classpathRoot = new File(System.getProperty("user.dir"));
				appDir = new File(classpathRoot, "/src/test/resources/");
				app = new File(appDir, "EstacioApp.app");
				desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "IphoneXUiTest");
				desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
				desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
				desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
				desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
				desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
				desiredCapabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
				desiredCapabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
				desiredCapabilities.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, true);
				desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
				desiredCapabilities.setCapability("unicodeKeyboard", true);
				desiredCapabilities.setCapability("resetKeyboard", true);
				desiredCapabilities.setCapability("connectHardwareKeyboard", true);
				//				desiredCapabilities.setCapability("udid", "BE50D29B-96AB-458A-9E45-BB27F3270CD0");
				desiredCapabilities.setCapability("udid", "5E324623-793C-44E3-9258-56A742135748"); //UDID DO JENKINS
				try {
					driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				break;
			default:
				throw new RuntimeException("Erro! executionOS não definido.");
		}

		appiumFieldDecorator = new AppiumFieldDecorator(driver, BaseConstants.DEFAULT_DURATION);
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

		if (appiumFieldDecorator != null) {
			appiumFieldDecorator = null;
		}
	}

	public static void resetApp() {
		if (driver != null) {
			driver.resetApp();
		}
	}
}


