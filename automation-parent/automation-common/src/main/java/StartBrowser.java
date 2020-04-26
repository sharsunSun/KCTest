import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
	
	public static void startChrome() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.out.println(System.getProperty("user.dir"));
		System.out.println("./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
	}
	
	public static void main(String[] args) {
		StartBrowser.startChrome();
		
	}
	
	

}
