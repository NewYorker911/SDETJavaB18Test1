package class19;

class Browser{

    void get (String url){
        System.out.println("Loading..."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in Browser");
    }

    void closeBrowser(){
        System.out.println("Closing the browser");
    }

}
public class Chrome extends Browser{

    void get (String url){
        System.out.println("Loading..."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in Chrome");
    }

    void closeBrowser(){
        System.out.println("Closing the Chrome browser");
    }
}

class FireFox extends Browser{
    void get (String url){
        System.out.println("Loading..."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in FireFox");
    }

    void closeBrowser(){
        System.out.println("Closing the FireFox browser");
    }
}

class Edge extends Browser{

    void get (String url){
        System.out.println("Loading..."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in Edge");
    }

    void closeBrowser(){
        System.out.println("Closing the Edge browser");
    }
}

class Safari extends Browser {

    void get (String url){
        System.out.println("Loading..."+url);
    }

    void performTest(){
        System.out.println("Checking if website is working properly in Safari");
    }

    void closeBrowser(){
        System.out.println("Closing the Safari browser");
    }
}
