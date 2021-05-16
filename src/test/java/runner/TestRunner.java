package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json"},
        features = {"src/test/resources/cucumber"},
        glue = {"steps"},
        publish = true

//        Share your Cucumber Report with your team at https://reports.cucumber.io          │
//        │ Activate publishing with one of the following:                                    │
//        │                                                                                   │
//        │ src/test/resources/cucumber.properties:          cucumber.publish.enabled=true    │
//        │ src/test/resources/junit-platform.properties:    cucumber.publish.enabled=true    │
//        │ Environment variable:                            CUCUMBER_PUBLISH_ENABLED=true    │
//        │ JUnit:                                           @CucumberOptions(publish = true) │
//        │                                                                                   │
//        │ More information at https://reports.cucumber.io/docs/cucumber-jvm

)

public class TestRunner {
}

