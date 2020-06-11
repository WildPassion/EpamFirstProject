package epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.service.StringParser;
import by.epam.javatr.dedik.day1.service.exception.ConvertException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Month;

import static org.testng.Assert.assertEquals;

public class StringParserTest {
    private StringParser parser;

    @BeforeClass
    private void initialize() {
        parser = new StringParser();
    }

    @Test
    public void toInteger_stringWithIntegerNumber_intNumber() {
        String actual = "450";
        int expected = 450;
        assertEquals(parser.toInteger(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not integer number.")
    public void toInteger_notNumber_convertedException() {
        parser.toInteger("qwe");
    }

    @Test
    public void toDouble_stringWithDoubleNumber_doubleNumber() {
        String actual = "13.456";
        double expected = 13.456;
        assertEquals(parser.toDouble(actual), expected);
    }

    @Test
    public void toDouble_stringWithIntegerNumber_doubleNumber() {
        String actual = "13456";
        double expected = 13456;
        assertEquals(parser.toDouble(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not double number.")
    public void toDouble_notNumber_convertException() {
        parser.toDouble("qwe");
    }


    @Test
    public void toMonth_stringWithMonthNumber_month() {
        String actual = "12";
        Month expected = Month.DECEMBER;
        assertEquals(parser.toMonth(actual), expected);
    }

    @Test
    public void toMonth_stringWithMonthName_month() {
        String actual = "December";
        Month expected = Month.DECEMBER;
        assertEquals(parser.toMonth(actual), expected);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_stringWithoutMonthName_month() {
        String actual = "Dqwe";
        parser.toMonth(actual);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_stringWithNotMonthNumber_month() {
        String actual = "122";
        parser.toMonth(actual);
    }

    @Test(expectedExceptions = ConvertException.class,
            expectedExceptionsMessageRegExp = "Received value is not a month.")
    public void toMonth_stringWithShortMonthName_month() {
        String actual = "Dec";
        parser.toMonth(actual);
    }
}
