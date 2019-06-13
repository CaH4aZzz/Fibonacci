package controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class NumberManipulatorTest {

    int base;
    int exp;
    double expected;
    private NumberManipulator manipulator;

    public NumberManipulatorTest(int base, int exp, double expected) {
        this.base = base;
        this.exp = exp;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1, 0},
                {1, 0, 1},
                {5, 8, 390625.0},
                {12, 4, 20736.0},
                {19, 4, 130321.0},
                {5, -4, 0.0016}
        });
    }

    @Before
    public void setup() {
        manipulator = new NumberManipulator();
    }

    @Test
    public void test_getExponentialValue() {
        assertThat(manipulator.getExponentialValue(base, exp), is(expected));
    }
}