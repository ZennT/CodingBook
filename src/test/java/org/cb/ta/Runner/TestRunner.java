package org.cb.ta.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/org/cb/ta/Features"},
        glue = {"org/cb/ta/TestSteps"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
