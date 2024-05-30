package playwrightAutomation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class InteractingWithInputs {

	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
				.setHeadless(false)
				.setChannel("chrome")
				
				);
		
			Page page = browser.newPage();
			page.navigate("https://letcode.in/edit");
		//	page.pause();
			
		//	Type
	        
			page.locator("#fullName").type("Test Name");
		//	playwright.close();
			
		// Fill
			
			page.locator("#fullName").type("Test Name");
//			page.pause();
			page.locator("#fullName").fill("Random Text");
			
			Locator locator = page.locator("#join");
//			page.waitForTimeout(5000);
		//	locator.press("End");
			
	    //		page.waitForTimeout(5000);
	    //		locator.type(" Guy");
			
        //     	page.waitForTimeout(5000);
	    //		locator.press("Tab");
			
			page.fill("#fullName", "Test Name");
			
			String value = page.locator("id=getMe").getAttribute("value");
			System.out.println(value);
	
	}	
	
	
}
