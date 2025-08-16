package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//D:\pra\OrangeHrmDemo\Feature\pm.feature
@CucumberOptions(features =".//Feature/",
        glue= "stepDefinitions",
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:test-output"},
        tags={"@RegressionTest"}
)

public class TestRunner{

}


