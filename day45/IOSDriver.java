package day45;

public class IOSDriver implements MobileDriver {

	@Override
	public void startApp(String appName) {
		System.out.println("Open app in IOS: " + appName);
	}

	@Override
	public void clickOnBtn(String btnName) {
		System.out.println("Click on IOS: " + btnName);
		
	}

	@Override
	public void tapOnScreen(int x, int y) {
		System.out.println("Tap on IOS: x=" + x + "y=" + y);
		
	}

	@Override
	public void swipeScreen(int xInit, int yInit, int xTarget, int yTarget) {
		System.out.println("Swipe screen on android");
		
	}

	@Override
	public String readText(String elementName) {
		System.out.println("Reading in IOS text of " + elementName);
		return "welcome to homepage";
	}

	@Override
	public void insertText(String elementName, String txt) {
		System.out.println("Insert text in IOS");
		
	}

	@Override
	public void closeApp(String appName) {
		System.out.println("Closing app in IOS");
		
	}

	
}
