package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

import java.util.List;

public class TenthTask {
    public static void main(String[] args) {
        String beginInterval = "0";
        String endInterval = "360";
        String stepInterval = "5";

        ArithmeticService service = new ArithmeticService();
        StringConverter converter = new StringConverter();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        int begin = converter.toInteger(beginInterval);
        int end = converter.toInteger(endInterval);
        int step = converter.toInteger(stepInterval);
        List<Double> listTangent = service.calculateTangentOnInterval(begin, end, step);

        console.showTangentOnInterval(listTangent, begin, step);
    }
}
