package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class NinthTask {
    public static void main(String[] args) {
        String radius = "45";

        ArithmeticService service = new ArithmeticService();
        ConsoleDemonstrator console = new ConsoleDemonstrator();
        StringConverter converter = new StringConverter();

        int convertedRadius = converter.toInteger(radius);
        double lengthCircle = service.calculateLengthCircle(convertedRadius);
        double areaCircle = service.calculateAreaCircle(convertedRadius);

        console.showLengthAndAreaCircle(lengthCircle, areaCircle);
    }
}
