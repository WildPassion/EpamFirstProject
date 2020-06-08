package by.epam.javatr.dedik.day1.service.validation;

public class NumberValidator {
    public boolean isInteger(String number) {
        boolean result = true;
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    public boolean isDouble(String number) {
        boolean result = true;
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }
}
