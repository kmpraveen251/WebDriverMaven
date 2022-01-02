package co.test;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void doLogin() {
        System.out.println(driver.getTitle());
    }

}