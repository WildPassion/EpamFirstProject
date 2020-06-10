package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class EighthTask {
    public static void main(String[] args) {
        String argument = "22";

        ArithmeticService service = new ArithmeticService();
        ConsoleDemonstrator console = new ConsoleDemonstrator();
        StringConverter converter = new StringConverter();

        int convertedArgument = converter.toInteger(argument);
        double result = service.calculateFunction(convertedArgument);

        console.showResultFunction(result);
    }
}
