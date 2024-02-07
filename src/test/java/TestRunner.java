import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\rajan\\Desktop\\Cucumber2\\src\\main\\java\\FeatureFile",
        glue = {"StepDefinition"},
        tags = "@Reg or @Smoke",
        plugin = {"pretty","html:target/HtmlReports"}
)


public class TestRunner {
}
