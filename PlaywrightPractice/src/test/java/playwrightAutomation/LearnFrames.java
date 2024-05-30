package playwrightAutomation;

import java.util.List;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);
		Page page = playwright.chromium().launch(headless).newPage();
		page.navigate("https://letcode.in/frame");
//		page.pause();
		
		
		
//		List<Frame>frames = page.frames();
//		System.out.println(frames.size());
		
		
		Frame frame = page.frame("firstFr");
//		page.getByPlaceholder("fname").fill("Test");
//		page.getByPlaceholder("lname").fill("User");
		
		
//		FrameLocator framelocator = page.frameLocator("#firstFr");
//		framelocator.getByPlaceholder("Enter name").type("Test");
//		framelocator.getByPlaceholder("lname").type("User");
//		
//		framelocator.getByPlaceholder("Enter email").type("test123");
//		
//		FrameLocator childfrmae = framelocator.frameLocator("iframe.has-background-white");
//		childfrmae.getByPlaceholder("Enter email").type("Test@test.com");
//		page.waitForTimeout(3000);
//		
		
		List<Frame>childframes = frame.childFrames();
		System.out.println(childframes.size());
		
		childframes.forEach(f->{
			System.out.println(f.url());
		});
		
		Frame innerframe = page.frameByUrl("https://letcode.in/innerFrame");
		 innerframe.getByPlaceholder("Enter email").type("innerframe@mail.com");
		 Thread.sleep(1000);
		 
		 playwright.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
