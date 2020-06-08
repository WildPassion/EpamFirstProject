package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import by.epam.javatr.dedik.day1.service.ArithmeticService;
import by.epam.javatr.dedik.day1.service.StringConverter;

import java.time.Month;

public class SecondTask {
    public static void main(String[] args) {
        String year = "20";
        String month = "02";
        String yearBeforeChrist = "-131";
        String monthStr = "February";
        String badMonth = "Feb";

        ArithmeticService service = new ArithmeticService();
        StringConverter converter = new StringConverter();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        Month convertedMonth = converter.toMonth(month);
        int convertedYear = converter.toYear(year);
        int days = service.calculateDays(convertedMonth, convertedYear);
        console.showDays(year, month, days);

        Month convertedStrMonth = converter.toMonth(monthStr);
        int daysStr = service.calculateDays(convertedStrMonth, converter.toYear(yearBeforeChrist));
        console.showDays(yearBeforeChrist, monthStr, daysStr);

        Month convertedBagMonth = converter.toMonth(badMonth);
    }
}
