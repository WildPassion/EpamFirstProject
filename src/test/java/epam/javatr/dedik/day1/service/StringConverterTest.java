package epam.javatr.dedik.day1.service;

import epam.javatr.dedik.day1.service.exception.ConvertException;
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
    public void toInteger_stringWithIntegerNumber_intNumber() {
        String actual = "450";
        int expected = 450;
        assertEquals(converter.toInteger(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not integer number.")
    public void toInteger_notNumber_convertedException() {
        converter.toInteger("qwe");
    }

    @Test
    public void toDouble_stringWithDoubleNumber_doubleNumber() {
        String actual = "13.456";
        double expected = 13.456;
        assertEquals(converter.toDouble(actual), expected);
    }

    @Test
    public void toDouble_stringWithIntegerNumber_doubleNumber() {
        String actual = "13456";
        double expected = 13456;
        assertEquals(converter.toDouble(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not double number.")
    public void toDouble_notNumber_convertException() {
        converter.toDouble("qwe");
    }


    @Test
    public void toMonth_stringWithMonthNumber_month() {
        String actual = "12";
        Month expected = Month.DECEMBER;
        assertEquals(converter.toMonth(actual), expected);
    }

    @Test
    public void toMonth_stringWithMonthName_month() {
        String actual = "December";
        Month expected = Month.DECEMBER;
        assertEquals(converter.toMonth(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_stringWithoutMonthName_month() {
        String actual = "Dqwe";
        converter.toMonth(actual);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_stringWithNotMonthNumber_month() {
        String actual = "122";
        converter.toMonth(actual);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_stringWithShortMonthName_month() {
        String actual = "Dec";
        converter.toMonth(actual);
    }
}
