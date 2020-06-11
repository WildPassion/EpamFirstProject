package by.epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.entity.Point;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class ArithmeticService {
    public static final int LIMIT = 2;

    private static final int LEAP_YEAR_INDEX = 4;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;

    public int calculateLastNumberSquare(int number) {
        String stringNumber = String.valueOf(number);
        int lastNumeric = Integer.parseInt(String.valueOf(stringNumber.charAt(stringNumber.length() - 1)));

        String squareLastNumeric = String.valueOf((int) pow(lastNumeric, 2));
        return Integer.parseInt(String.valueOf(squareLastNumeric.charAt(squareLastNumeric.length() - 1)));
    }

    private boolean checkLeapYear(int year) {
        return (year % LEAP_YEAR_INDEX) == 0;
    }

    public int calculateDays(Month month, int year) {
        return month.length(checkLeapYear(year));
    }

    public double calculateNestedSquareArea(double describedSquareArea) {
        BigDecimal bigDecimal = BigDecimal.valueOf(pow(sqrt(describedSquareArea) / sqrt(2), 2));
        return bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double calculateTranscendence(double describedSquareArea, double nestedSquareArea) {
        return describedSquareArea / nestedSquareArea;
    }

    public boolean isEven(int number) {
        return number != 0 && number % 2 == 0;
    }

    public boolean isLimitEven(int[] numbers) {
        int count = 0;
        boolean result = false;
        for (int number : numbers) {
            if (number != 0 && isEven(number)) {
                count++;
            }
            if (count >= LIMIT) {
                result = true;
            }
        }
        return result;
    }

    public boolean isNumberPerfect(int number) {
        int dividerAmount = 0;
        for (int i = 1; i < number; ++i) {
            if (number % i == 0) {
                dividerAmount += i;
            }
        }
        return dividerAmount == number;
    }

    public LocalTime calculateTime(int secondsPerDay) {
        return LocalTime.of(secondsPerDay / SECONDS_PER_HOUR,
                (secondsPerDay % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE,
                secondsPerDay % SECONDS_PER_HOUR % SECONDS_PER_MINUTE);
    }

    public Point nearestPoint(Point a, Point b) {
        Point result = null;
        if (a.compareTo(b) > 0) {
            result = b;
        } else if (a.compareTo(b) < 0) {
            result = a;
        }
        return result;
    }

    public double calculateFunction(int x) {
        double result;
        if (x >= 3) {
            result = -(x * x) + 3 * x + 9;
        } else {
            result = 1 / (pow(x, 3) - 6);
        }
        return result;
    }

    public double calculateLengthCircle(int radius) {
        return 2 * Math.PI * radius;
    }

    public double calculateAreaCircle(int radius) {
        return Math.PI * pow(radius, 2);
    }

    private Double calculateTangent(int angle) {
        Double result;
        if (angle == 90 || angle % 180 == 90) {
            result = null;
        } else {
            result = BigDecimal.valueOf(tan(toRadians(angle)))
                    .setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
        return result;
    }

    public List<Double> calculateTangentOnInterval(int begin, int end, int step) {
        List<Double> list = new ArrayList<>();
        while (begin < end) {
            list.add(calculateTangent(begin));
            begin += step;
        }
        list.add(calculateTangent(end));
        return list;
    }
}
