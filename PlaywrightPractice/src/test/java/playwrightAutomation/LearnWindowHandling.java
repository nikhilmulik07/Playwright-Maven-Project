package playwrightAutomation;

import java.util.List;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class LearnWindowHandling {

	
	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);
		Page page = playwright.chromium().launch(headless).newPage();
		page.navigate("https://letcode.in/windows");
		
		
//		Page popup = page.waitForPopup(()->{
//			page.locator("id=home").click();
//		});
//		
//		popup.waitForLoadState();
//		System.out.println("new tab: "+ popup.title());
//		System.out.println("new tab: "+ popup.url());
//		
//		popup.close();
//		page.close();
		
		
		page.waitForPopup(new Page.WaitForPopupOptions().setPredicate
				(p-> p.context().pages().size()==3
				), ()->{
					page.locator("id=multi").click();
					
				});
		
		List<Page> pages = page.context().pages();
		for(Page tabs : pages) {
			tabs.waitForLoadState();
			System.out.println(tabs.url());
		}
		Page alertpage = pages.get(1);
		Page dropdownpage = pages.get(2);
		
		System.out.println("Alert page:"+alertpage.textContent("h1"));
		System.out.println("Dropdownpage:"+dropdownpage.textContent("h1"));
		
		
		playwright.close();
		
		
		
	}
	
	
	
	
	
	
	
	
}
