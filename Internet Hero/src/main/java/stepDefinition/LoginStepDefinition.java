package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import javax.xml.soap.Text;
import java.util.List;

public class LoginStepDefinition {


    WebDriver driver;


    @Given("^user is on internet hero landing page$")
    public void user_is_on_internet_hero_landing_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/raymondhuynh/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @When("^title of homepage is welcome to the internet$")
    public void title_of_homepage_the_internet() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("The Internet", title);
    }

    @Then("^user clicks on Javascript Alerts$")
    public void user_enters_user_and_pass() {
        WebElement jsa = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", jsa);
    }

    @Then("^user clicks on click for JS confirm$")
    public void user_clicks_on_js_confirm() {
        WebElement jsconfirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", jsconfirm);
    }

    @And("^user clicks ok on Javascript alert$")
    public void user_clicks_on_alert_box() {
        driver.switchTo().alert().accept();
    }

    @Then("^user sees OK result displayed$")
    public void user_sees_ok_result_displayed() {
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You clicked: Ok", actualResult);
    }

    }



