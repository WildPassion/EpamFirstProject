package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class FifthTask {
    public static void main(String[] args) {
        String number = "29";
        String perfectNumber = "28";
        String badNumber = "28q";

        ArithmeticService service = new ArithmeticService();
        StringConverter converter = new StringConverter();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        int convertNumber = converter.toInteger(number);
        boolean numberResult = service.isNumberPerfect(convertNumber);
        console.showIsNumberPerfect(convertNumber, numberResult);

        int convertPerfectNumber = converter.toInteger(perfectNumber);
        boolean perfectNumberResult = service.isNumberPerfect(convertPerfectNumber);
        console.showIsNumberPerfect(convertPerfectNumber, perfectNumberResult);

        int convertBadNumber = converter.toInteger(badNumber);
    }
}
