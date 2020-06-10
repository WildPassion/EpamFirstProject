package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import by.epam.javatr.dedik.day1.entity.Point;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class SeventhTask {
    public static void main(String[] args) {
        String xCoordinateA = "12";
        String yCoordinateA = "-56";
        String xCoordinateB = "-54";
        String yCoordinateB = "16";

        StringConverter converter = new StringConverter();
        ArithmeticService service = new ArithmeticService();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        Point a = new Point(converter.toInteger(xCoordinateA), converter.toInteger(yCoordinateA));
        Point b = new Point(converter.toInteger(xCoordinateB), converter.toInteger(yCoordinateB));
        a.calculateInterval();
        b.calculateInterval();

        console.showNearestPoint(service.nearestPoint(a, b));
    }
}
