package TestRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "C:\\Users\\Aryan.Pandey\\IdeaProjects\\Swaglabs_gradle\\src\\test\\resources\\Features\\Login.feature",glue = "StepDefinitions")
public class Runner {
}
