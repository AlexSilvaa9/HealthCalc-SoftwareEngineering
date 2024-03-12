package cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import healthcalc.HealthCalcImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {

private HealthCalcImpl calc;
private float weight;
private int height;
private char gender;
private int age;

    @Given("I click on {string} Button")
public void i_click_on_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    calc= new HealthCalcImpl();

}

@Then("The system raises an exception")
public void the_system_raises_an_exception() {
    assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(weight, height, gender, age));

}

@When("I introduce my gender {string} and heigth {int}")
public void i_introduce_my_gender_and_heigth(String string, Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    height=int1;
    gender=string.charAt(0);
}

@Then("I should see my ideal wheight {int}")
public void i_should_see_my_ideal_wheight(float int1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(int1,calc.idealWeight(height, gender));
}

@When("I introduce my gender {string} or heigth {int} incorrectly")
public void i_introduce_my_gender_or_heigth_incorrectly(String string, Integer int1) {
    height=int1;
    gender=string.charAt(0);
}

@When("I introduce my gender {string}, heigth {int}, weight {int} or age {int}")
public void i_introduce_my_gender_heigth_weight_or_age(String string, Integer int1, Integer int2, Integer int3) {
    weight=int2;
    height=int1;
    gender=string.charAt(0);
    age=int3;
}

@Then("The system returns {double}")
public void the_system_returns(Double double1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(double1,calc.basalMetabolicRate(weight, height, gender, age));
}

@When("I introduce my gender {string}, heigth {int}, weight {int} or age {int} incorrectly")
public void i_introduce_my_gender_heigth_weight_or_age_incorrectly(String string, Integer int1, Integer int2, Integer int3) {
    weight=int2;
    height=int1;
    gender=string.charAt(0);
    age=int3;
}
}