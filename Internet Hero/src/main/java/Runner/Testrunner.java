package Runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/raymondhuynh/IdeaProjects/Internet Hero/src/main/java/Features/InternetHero.feature"
        , glue = {"stepDefinition"}
)


public class Testrunner {
}
