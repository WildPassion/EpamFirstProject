package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

import java.time.LocalTime;

public class SixthTask {
    public static void main(String[] args) {
        String seconds = "65789";

        ArithmeticService service = new ArithmeticService();
        ConsoleDemonstrator console = new ConsoleDemonstrator();
        StringConverter converter = new StringConverter();

        int convertedSeconds = converter.toInteger(seconds);
        LocalTime time = service.calculateTime(convertedSeconds);
        console.showTime(time);
    }
}
