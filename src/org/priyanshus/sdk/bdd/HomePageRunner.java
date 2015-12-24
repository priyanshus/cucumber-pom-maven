package org.priyanshus.sdk.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			plugin = { "pretty", "html:target/cucumber" },
			tags = {"@homepage"}
		)
public class HomePageRunner {

}
