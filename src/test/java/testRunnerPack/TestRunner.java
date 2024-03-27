package testRunnerPack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


	@CucumberOptions(features="C:/Users/WELCOME/eclipse-workspace/BaiscTest/src/test/resource/web/Login.feature", 
			glue="stepDefinationPack",
			monochrome=true, 
			plugin="html:target/cucumber.html",
			dryRun=false,
			tags= "@tag4")

public class TestRunner extends AbstractTestNGCucumberTests {
		TestNGCucumberRunner runobj=new TestNGCucumberRunner(this.getClass());

}


