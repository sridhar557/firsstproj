package TestRun;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//TECHOLUTION//IdeaProjects//firsstproj//Feature//Testfeature.feature",
glue="StepDef"
)

public class TestRunner {
}
