package class22;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElements();
}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window");
    }

    @Override
    public void findElements() {
        System.out.println("Finding elements ");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window");
    }

    @Override
    public void findElements() {
        System.out.println("Finding elements");
    }
}

class WebDriverTester{
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver t:arr){
            t.openBrowser();
            t.closeBrowser();
            t.maximizeWindow();
            t.findElements();
        }
    }

}
