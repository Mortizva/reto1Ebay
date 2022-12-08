package com.ebay.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.ebay.www.features/login.feature",
        glue = "com.ebay.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)


public class LoginRunner {
}
