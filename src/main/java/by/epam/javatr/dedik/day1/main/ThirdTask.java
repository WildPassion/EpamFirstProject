package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class ThirdTask {
    public static void main(String[] args) {
        String describedSquareArea = "25.00";
        String bedDescribedSquareArea = "qwe";

        ArithmeticService service = new ArithmeticService();
        StringConverter converter = new StringConverter();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        double convertedDescribedSquareArea = converter.toDouble(describedSquareArea);
        double nestedSquareArea = service.calculateNestedSquareArea(convertedDescribedSquareArea);
        double transcendence = service.calculateTranscendence(convertedDescribedSquareArea, nestedSquareArea);

        console.showTranscendenceNestedArea(convertedDescribedSquareArea, nestedSquareArea, transcendence);

        double convertedBadDescribedSquareArea = converter.toDouble(bedDescribedSquareArea);
    }
}
