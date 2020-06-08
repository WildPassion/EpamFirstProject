package by.epam.javatr.dedik.day1.service.validation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class NumberValidationTest {
    private NumberValidator validator;

    @BeforeClass
    private void initialize() {
        validator = new NumberValidator();
    }

    @Test
    public void isInteger_Integer_True() {
        assertTrue(validator.isInteger("1000"));
    }

    @Test
    public void isInteger_BigNumber_False() {
        assertFalse(validator.isInteger("10000000000"));
    }

    @Test
    public void isInteger_NotNumber_False() {
        assertFalse(validator.isInteger("1000q"));
    }

    @Test
    public void isDouble_Double_True() {
        assertTrue(validator.isDouble("123.456"));
    }

    @Test
    public void isDouble_Integer_True() {
        assertTrue(validator.isDouble("123"));
    }

    @Test
    public void isDouble_BigNumberAfterPoint_True() {
        assertTrue(validator.isDouble("123.987984651321321546848768451468798415164686451"));
    }

    @Test
    public void isDouble_NotNumber_False() {
        assertFalse(validator.isDouble("123..987984651321321546848768451468798415164686451"));
    }

    @Test
    public void isDouble_BigNumberAfterPointWithSymbol_False() {
        assertFalse(validator.isDouble("123.9879846513213215468487684514687984151646864511q"));
    }
}
