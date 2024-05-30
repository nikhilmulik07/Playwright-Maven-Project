package playwrightAutomation;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.setDefaultAssertionTimeout;


public class LearnAssertions {

	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);
		Page page = playwright.chromium().launch(headless).newPage();
		page.navigate("https://letcode.in/edit");
	
		Locator header = page.locator("h1");
		assertThat(header).hasText("Input");
		
		setDefaultAssertionTimeout(1000);
	//	assertThat(page).hasTitle("Interact with Input fields");
		
		assertThat(page).hasURL("https://letcode.in/edit");
		
	//	assertThat(page.locator("#join")).hasAttribute("value", "I am good");
		
		assertThat(page.locator("#join")).hasValue("I am good");
		
		
		page.navigate("https://letcode.in/radio");
		assertThat(page.locator("#join")).isChecked();
		
		
		
		
		
		playwright.close();		
	}
	
	
	
	
}
