package class19;

public class BrowserTester {
    public static void main(String[] args) {

        Chrome chrome=new Chrome();
        //chrome.get("https://amazon.com");
        //chrome.performTest();
        //chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        //fireFox.get("https://amazon.com");
        //fireFox.performTest();
        //fireFox.closeBrowser();

        Safari safari=new Safari();
        //safari.get("https://amazon.com");
        //safari.performTest();
        //safari.closeBrowser();

        System.out.println("***************************************");

        Browser [] bArr={chrome, fireFox, safari };

        for (int i = 0; i < bArr.length; i++) {

            Browser b=bArr[i];
            b.get("https://amazon.com");
            b.performTest();
            b.closeBrowser();

        }


    }
}
