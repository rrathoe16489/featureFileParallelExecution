package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features",
		glue="",
		tags="",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
		dryRun=false
		)
public class RunTest {
	
	
	
}
