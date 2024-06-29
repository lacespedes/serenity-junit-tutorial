package serenityswag.authentication.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {

    @Step("Log in as a {0}")
    public void as(User user) {
        openUrl("https://www.saucedemo.com");

        // Short cut
        //$("[data-test='username']").sendKeys(user.getUsername());
        //$("[data-test='password']").sendKeys(user.getPassword());
        //$("[data-test='login-button']").click();

        // find by id
        //find(By.id("user-name")).sendKeys(user.getUsername());
        //find(By.id("password")).sendKeys(user.getPassword());
        //find(By.id("login-button")).click();

        // find by id (Short cut)
//        $("#user-name").sendKeys(user.getUsername());
//        $("#password").sendKeys(user.getPassword());
//        $("#login-button").click();

        // find by name
        find(By.name("user-name")).sendKeys(user.getUsername());
        find(By.name("password")).sendKeys(user.getPassword());
        find(By.name("login-button")).click();
    }


//    @Step("Log in as a {0}")
//    public void usingCredentials(String username, String password) {
//        openUrl("https://www.saucedemo.com");
//
//        $("[data-test='username']").sendKeys(username);
//        $("[data-test='password']").sendKeys(password);
//        $("[data-test='login-button']").click();
//
//    }

//    public void asAStandarUser() {
//        //driver.get("https://www.saucedemo.com");
//        openUrl("https://www.saucedemo.com");
//
////        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
////        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
////        driver.findElement(By.cssSelector("[data-test='login-button']")).click();
//
////        find("[data-test='username']").sendKeys("standard_user");
////        find("[data-test='password']").sendKeys("secret_sauce");
////        find("[data-test='login-button']").click();
//
//        $("[data-test='username']").sendKeys("standard_user");
//        $("[data-test='password']").sendKeys("secret_sauce");
//        $("[data-test='login-button']").click();
//
//    }
}
