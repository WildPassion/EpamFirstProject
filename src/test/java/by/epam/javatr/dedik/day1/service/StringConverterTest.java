package by.epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.service.exception.ConvertException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Month;

import static org.testng.Assert.assertEquals;

public class StringConverterTest {
    private StringConverter converter;

    @BeforeClass
    private void initialize() {
        converter = new StringConverter();
    }

    @Test
    public void toInteger_StringWithIntegerNumber_IntNumber() {
        String actual = "450";
        int expected = 450;
        assertEquals(converter.toInteger(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not integer number.")
    public void toInteger_NotNumber_ConvertedException() {
        converter.toInteger("qwe");
    }

    @Test
    public void toDouble_StringWithDoubleNumber_DoubleNumber() {
        String actual = "13.456";
        double expected = 13.456;
        assertEquals(converter.toDouble(actual), expected);
    }

    @Test
    public void toDouble_StringWithIntegerNumber_DoubleNumber() {
        String actual = "13456";
        double expected = 13456;
        assertEquals(converter.toDouble(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not double number.")
    public void toDouble_NotNumber_ConvertException() {
        converter.toDouble("qwe");
    }


    @Test
    public void toMonth_StringWithMonthNumber_Month() {
        String actual = "12";
        Month expected = Month.DECEMBER;
        assertEquals(converter.toMonth(actual), expected);
    }

    @Test
    public void toMonth_StringWithMonthName_Month() {
        String actual = "December";
        Month expected = Month.DECEMBER;
        assertEquals(converter.toMonth(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_StringWithoutMonthName_Month() {
        String actual = "Dqwe";
        converter.toMonth(actual);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_StringWithNotMonthNumber_Month() {
        String actual = "122";
        converter.toMonth(actual);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_StringWithShortMonthName_Month() {
        String actual = "Dec";
        converter.toMonth(actual);
    }
}
