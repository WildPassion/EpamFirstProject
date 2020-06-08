package by.epam.javatr.dedik.day1.console;

import by.epam.javatr.dedik.day1.entity.Point;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleDemonstrator {
    public void showLastNumericSquare(String number, int lastNumericSquare) {
        System.out.println("Number: " + number);
        System.out.println("Last numeric in square of this number: " + lastNumericSquare);
    }

    public void showDays(String year, String month, int days) {
        System.out.printf("Year: %s Month: %s Days: %d%n", year, month, days);
    }

    public void showTranscendenceNestedArea(double describedSquareArea, double nestedSquareArea, double transcendence) {
        System.out.printf("Described square area: %.3f%n", describedSquareArea);
        System.out.printf("Nested square area: %.3f%n", nestedSquareArea);
        System.out.printf("Transcendence: %.3f%n", transcendence);
    }

    public void showIsLimitEven(int[] numbers, int limit, boolean even) {
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(String.valueOf(numbers[i]).concat(","));
        }
        System.out.printf(String.valueOf(numbers[numbers.length - 1]).concat("%n"));
        System.out.printf("Is numbers have %d evens: %s%n", limit, even);
    }

    public void showIsNumberPerfect(int number, boolean perfect) {
        System.out.printf("Number %d is perfect: %s%n", number, perfect);
    }

    public void showTime(LocalTime time) {
        System.out.println("Time: " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public void showNearestPoint(Point point) {
        if (point == null) {
            System.out.println("Points are equidistant");
        } else {
            System.out.println("Nearest point is: " + point.toString());
        }
    }

    public void showResultFunction(double result) {
        System.out.printf("Result function: %.3f%n", result);
    }

    public void showLengthAndAreaCircle(double length, double area) {
        System.out.printf("Length circle: %.3f%n", length);
        System.out.printf("Area circle: %.3f%n", area);
    }

    private void showTangent(int value, Double tangent) {
        if (tangent == null) {
            System.out.println("Value: " + value + "; Tangent: INFINITY");
        } else {
            System.out.printf("Value: %d; Tangent: %.3f%n", value, tangent);
        }
    }

    public void showTangentOnInterval(List<Double> list, int begin, int step) {
        for (int i = 0; i < list.size(); i++) {
            showTangent(begin, list.get(i));
            begin += step;
        }
    }
}
