package com.auto;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty" , "html:target"},monochrome = true,
        features= {"src/test/resources/Feature"},
        snippets = SnippetType.CAMELCASE, tags = {""},
        glue = {""}
)

public class RunCukes {
}