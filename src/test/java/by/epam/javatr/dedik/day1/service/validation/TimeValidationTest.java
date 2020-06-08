package by.epam.javatr.dedik.day1.service.validation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TimeValidationTest {
    private TimeValidator validator;

    @BeforeClass
    public void initialize() {
        validator = new TimeValidator();
    }

    @Test
    public void isValidMonth_NumberMonth_True() {
        assertTrue(validator.isValidMonth("12"));
    }

    @Test
    public void isValidMonth_NotMonthNumber_False() {
        assertFalse(validator.isValidMonth("112"));
    }

    @Test
    public void isValidMonth_NumberMonthWithSymbol_False() {
        assertFalse(validator.isValidMonth("12q"));
    }

    @Test
    public void isValidMonth_UppercaseStringMonth_True() {
        assertTrue(validator.isValidMonth("FEBRUARY"));
    }

    @Test
    public void isValidMonth_LowercaseStringMonth_True() {
        assertTrue(validator.isValidMonth("february"));
    }

    @Test
    public void isValidMonth_ShortStringMonth_False() {
        assertFalse(validator.isValidMonth("Feb"));
    }

    @Test
    public void isValidMonth_NotStringMonth_False() {
        assertFalse(validator.isValidMonth("Fff"));
    }

    @Test
    public void isValidYear_CorrectYear_True() {
        assertTrue(validator.isValidYear("2000"));
    }

    @Test
    public void isValidYear_NegativeYear_True() {
        assertTrue(validator.isValidYear("-100"));
    }

    @Test
    public void isValidYear_NotNumber_False() {
        assertFalse(validator.isValidYear("-100q"));
    }

    @Test
    public void isValidYear_LowerLimitNumber_False() {
        assertFalse(validator.isValidYear("-1000"));
    }

    @Test
    public void isValidYear_UpperLimitNumber_False() {
        assertFalse(validator.isValidYear("3000"));
    }
}
