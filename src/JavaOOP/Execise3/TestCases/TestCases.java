package JavaOOP.Execise3.TestCases;

import JavaOOP.Execise3.Common.BaseTest;

public class TestCases extends BaseTest {

    //Create two method called Login() and AddCategory()
    public void loginTest(){

        createDriver();

        System.out.println("Open the URL");
        System.out.println("Enter user name and password");
        System.out.println("Click on the submit button");
        System.out.println("Observe the result");

        closeDriver();
    }


    public void addCategory(){
        createDriver();
        loginTest();
        System.out.println("Navigate to the menu of the left");
        System.out.println("Click on the Add category");
        System.out.println("Fill in the data into all fields");
        System.out.println("Click button submit");
        System.out.println("Observe the result");
        closeDriver();
    }

    public static void main(String[] args) {
        //Create an instance of The TestCases class
        TestCases testCases = new TestCases();

        System.out.println("This is login test case____________");
        testCases.loginTest();

        System.out.println("This is add category test case___________ ");
        testCases.addCategory();
    }

}
