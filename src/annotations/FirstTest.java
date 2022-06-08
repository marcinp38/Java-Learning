package annotations;

import org.testng.annotations.*;


public class FirstTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite " + this.getClass().getName());
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class " + this.getClass().getName());
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test " + this.getClass().getName());
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method " + this.getClass().getName());
    }
    @Test
    public void firstTest() {
        System.out.println("First test " + this.getClass().getName());
    }
    @Test
    public void secondTest() {
        System.out.println("Second test " + this.getClass().getName());
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After method " + this.getClass().getName());
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After test " + this.getClass().getName());
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After class " + this.getClass().getName());
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite " + this.getClass().getName());
    }
}
