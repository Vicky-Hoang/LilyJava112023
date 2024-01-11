package JavaOOP.Execise3.Common;

public class BaseTest {

    //Create two method called createDriver() and closeDriver()

    public void createDriver(){
        System.out.println("This is a browser" + Constants.browser);
        System.out.println("This is a report " + Constants.report);
        System.out.println("This is a headless" + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Closed Browser:" + Constants.browser);
    }

    public void closeDriver(String browser){
        System.out.println("Closed Browser:" + browser);
    }


}
