package junitRunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/registrationFeature"
,glue= {"seleniumgluecode"}
)

public class TestRunnner {

}