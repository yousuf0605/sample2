package com.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun= false,features = "C:\\Users\\YOUSUF\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\stepdefination\\FacebookStep.java", glue = "com.stepdefination" )
public class TestRunner {


}
