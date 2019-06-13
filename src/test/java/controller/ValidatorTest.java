package controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ValidatorTest {

    private Validator validator;
    private String input;
    private int expected;

    public ValidatorTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"0", 0},
                {"152", 152},
                {"345", 345}
        });

    }

    @Before
    public void setup(){
        validator = new Validator();
    }

    @Test(expected = NumberFormatException.class)
    public void test_getValidValue_emptyString() throws Exception {
        String param = "";
        validator.getValidValue(param);
    }

    @Test(expected = NumberFormatException.class)
    public void test_getValidValue_exceptionWhenParsing() throws Exception {
        String param = "23.4";
        validator.getValidValue(param);
    }

    @Test
    public void test_getExponentialValue() {
        assertThat(validator.getValidValue(input), is(expected));
    }

}