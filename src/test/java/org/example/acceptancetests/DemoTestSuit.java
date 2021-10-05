package org.example.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/demo", glue="org.example.steps",plugin = { "usage", "json:target/site/cucumber.json" })
public class DemoTestSuit {
}
