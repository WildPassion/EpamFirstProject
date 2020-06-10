package by.epam.javatr.dedik.day1.main;

import by.epam.javatr.dedik.day1.console.ConsoleDemonstrator;
import epam.javatr.dedik.day1.service.ArithmeticService;
import epam.javatr.dedik.day1.service.StringConverter;

public class FourthTask {
    public static void main(String[] args) {
        String numbers = "46512789";
        String badNumbers = "qew";

        ArithmeticService service = new ArithmeticService();
        StringConverter converter = new StringConverter();
        ConsoleDemonstrator console = new ConsoleDemonstrator();

        int[] convertNumbers = converter.toArray(numbers);
        boolean numbersResult = service.isLimitEven(convertNumbers);
        console.showIsLimitEven(convertNumbers, ArithmeticService.LIMIT, numbersResult);

        int[] badConvertNumbers = converter.toArray(badNumbers);
    }
}
