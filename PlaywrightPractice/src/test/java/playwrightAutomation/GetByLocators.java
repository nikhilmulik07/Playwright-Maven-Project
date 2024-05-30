package playwrightAutomation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class GetByLocators {

	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
				          .setHeadless(false)
				          .setChannel("chrome")
				
				);
		
			Page page = browser.newPage();
			page.navigate("https://bookcart.azurewebsites.net/");
	//		page.pause();
			
			page.getByText("Login").first().click();
	//		page.getByText("Login").nth(0).click();
			
			
			page.getByLabel("Username").fill("TestUser112");
			page.getByLabel("Password").fill("TestUser112");
			
			page.getByRole(AriaRole.BUTTON , new Page.GetByRoleOptions()
		    .setName("Login")).last().click();
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	//		playwright.close();
		
		
		
	}
	
	
	
	
	
}
