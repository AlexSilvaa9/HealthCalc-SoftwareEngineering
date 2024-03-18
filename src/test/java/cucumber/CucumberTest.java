package cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import healthcalc.HealthCalcImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {

private HealthCalcImpl calc= new HealthCalcImpl();
private float weight;
private int height;
private char gender;
private int age;
private boolean raises_error;
private float resultado;

    @Given("my gender {string} and heigth {int}")
public void my_gender_and_heigth(String string, Integer int1) {
    height=int1;
    gender=string.charAt(0);

}
@Given("my gender {string} or heigth {int} incorrectly")
public void my_gender_or_heigth_incorrectly(String string, Integer int1) {
    height=int1;
    gender=string.charAt(0);
}
@Then("The system raises an exception")
public void the_system_raises_an_exception() {
    assertEquals(true, raises_error);
}

@When("I calcule my ideal weight")
public void i_calcule_my_ideal_weight() {
    try{
        resultado=calc.idealWeight(height,gender);
    }catch(Exception e){
        raises_error=true;
    }
}

@Then("I should see my ideal wheight {int}")
public void i_should_see_my_ideal_wheight(float int1) throws Exception {
    assertEquals(int1,resultado);
}

@Then("I should see my imb {float}")
public void i_should_see_my_imb(float int1) throws Exception {
    assertEquals(int1,resultado);
}

@When("I calcule my imb")
public void i_calcule_my_imb() {
    try{
        resultado=calc.basalMetabolicRate(weight,height,gender,age);
    }catch(Exception e){
        raises_error=true;
    }
}

@Given("my gender {string}, heigth {int}, weight {int} and age {int}")
public void my_gender_heigth_weight_and_age(String string, Integer int1, Integer int2, Integer int3) {
    weight=int2;
    height=int1;
    gender=string.charAt(0);
    age=int3;
}

@Given("my gender {string}, heigth {int}, weight {int} or age {int} incorrectly")
public void my_gender_heigth_weight_or_age_incorrectly(String string, Integer int1, Integer int2, Integer int3) {
    weight=int2;
    height=int1;
    gender=string.charAt(0);
    age=int3;
}
}