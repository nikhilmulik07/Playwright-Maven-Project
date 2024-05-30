package playwrightAutomation;

import java.util.List;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class LearnDropDowns {

public static void main(String[] args) {

	Playwright playwright = Playwright.create();
	LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);
	Page page = playwright.chromium().launch(headless).newPage();
	page.navigate("https://letcode.in/dropdowns");
//	page.selectOption("#fruits", "3");
	
	
	Locator fruitsId = page.locator("#fruits");
	fruitsId.selectOption("1");
	
//	page.waitForTimeout(5000);
//	fruitsId.selectOption(new SelectOption().setLabel("Apple"));
	
//	String textcontent = page.locator("p.subtitle").textContent();
//	System.out.println(textcontent);
	
	
//	Locator heroes = page.locator("id=superheros");
//    heroes.selectOption(new String[] {"ta", "bp", "am"});
//	  page.waitForTimeout(5000);
	
	
	Locator langDD = page.locator("#lang");
	Locator options = langDD.locator("option");
	
	List<String> allInnerTexts = options.allInnerTexts();
	allInnerTexts.forEach(i-> System.out.println(i));
	
	
	
}
	
		
	
}
