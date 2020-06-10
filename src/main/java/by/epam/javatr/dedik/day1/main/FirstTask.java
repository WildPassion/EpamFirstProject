package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class FirstTask {
    public static void main(String[] args) {
        String number = "75621278";
        String badNumber = "qwe";

        StringConverter converter = new StringConverter();
        ArithmeticService service = new ArithmeticService();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        int convertedNumber = converter.toInteger(number);
        int numberResult = service.calculateLastNumberSquare(convertedNumber);
        console.showLastNumericSquare(number, numberResult);

        int convertedBadNumber = converter.toInteger(badNumber);
    }
}
