package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/logintoonetmail.feature",
        glue = "step_definitions"

)

public class Runner {

}