package by.epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.service.exception.ParseException;
import by.epam.javatr.dedik.day1.service.validation.NumberValidator;
import by.epam.javatr.dedik.day1.service.validation.TimeValidator;

import java.time.Month;

public class StringParser {
    private NumberValidator numberValidator = new NumberValidator();
    private TimeValidator timeValidator = new TimeValidator();

    public int toInteger(String number) throws ParseException {
        if (numberValidator.isInteger(number)) {
            return Integer.parseInt(number);
        } else {
            throw new ParseException("Received value is not integer number.");
        }
    }

    public double toDouble(String number) throws ParseException {
        if (numberValidator.isDouble(number)) {
            return Double.parseDouble(number);
        } else {
            throw new ParseException("Received value is not double number.");
        }
    }

    public Month toMonth(String month) throws ParseException {
        Month result;
        if (timeValidator.isValidMonth(month)) {
            if (numberValidator.isInteger(month)) {
                result = Month.values()[Integer.parseInt(month) - 1];
            } else {
                result = Month.valueOf(month.toUpperCase());
            }
        } else {
            throw new ParseException("Received value is not a month.");
        }
        return result;
    }

    public int toYear(String year) throws ParseException {
        if (timeValidator.isValidYear(year)) {
            return Integer.parseInt(year);
        } else {
            throw new ParseException("Received value is not valid year.");
        }
    }
}
