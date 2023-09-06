package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser {
	
	public RemoteWebDriver driver;
	
	public void startApp() {
		driver = new ChromeDriver();
	}

	@Override
	public void startApp(String browser) {
		// TODO Auto-generated method stub
	
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
	}

	
}
