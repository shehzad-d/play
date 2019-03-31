package com.sditta.play.step_definitions;

import com.usmanhussain.habanero.context.TestContext;
import com.usmanhussain.habanero.framework.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class MyStepdefs extends StepDefs {

    public MyStepdefs(TestContext context) {
        super(context);
    }

    @Given("^Test$")
    public void test() {
        getContext().getDriver().get("https://www.google.co.uk/");
    }
}
