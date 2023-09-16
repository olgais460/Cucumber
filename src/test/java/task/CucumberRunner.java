package task;
import static io.cucumber.core.options.Constants.FEATURES_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;



    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("/")
    @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "task.StepDefinition")
    @ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "classpath:features")
    public class CucumberRunner extends JunitHooks {
    }


