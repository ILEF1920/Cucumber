package com.robust.springboot.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources",
        glue="classpath:com.robust.springboot.cucumber",
        stepNotifications = true,
        tags = "@RegressionTest",
        publish = false
        plugin = {"json:target/cucumber.json"},
)
public class TestRunner {
}
