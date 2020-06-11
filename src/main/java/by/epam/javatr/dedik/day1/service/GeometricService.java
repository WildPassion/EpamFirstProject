package by.epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.entity.Point;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;
import static java.lang.Math.toRadians;

public class GeometricService {
    public double calculateNestedSquareArea(double describedSquareArea) {
        BigDecimal bigDecimal = BigDecimal.valueOf(pow(sqrt(describedSquareArea) / sqrt(2), 2));
        return bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double calculateTranscendence(double describedSquareArea, double nestedSquareArea) {
        return describedSquareArea / nestedSquareArea;
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
