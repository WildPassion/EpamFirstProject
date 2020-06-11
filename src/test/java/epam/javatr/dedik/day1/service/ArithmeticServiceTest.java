package epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.entity.Point;
import by.epam.javatr.dedik.day1.service.ArithmeticService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static org.testng.Assert.*;

public class ArithmeticServiceTest {
    ArithmeticService service;

    @BeforeClass
    public void initialize() {
        service = new ArithmeticService();
    }

    @Test
    public void calculateLastNumberSquare_number_lastNumberSquare() {
        int actual = service.calculateLastNumberSquare(1449);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateDays_monthLeapYear_days() {
        Month actualMonth = Month.FEBRUARY;
        int year = 0;
        int actual = service.calculateDays(actualMonth, year);
        int expected = 29;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateDays_monthYear_days() {
        Month actualMonth = Month.FEBRUARY;
        int year = 13;
        int actual = service.calculateDays(actualMonth, year);
        int expected = 28;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateNestedSquareArea_describedArea_nestedArea() {
        double describedArea = 50;
        double actual = service.calculateNestedSquareArea(describedArea);
        double expected = 25;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateTranscendence_describedAndNestedArea_transcendence() {
        double describedArea = 50;
        double nestedArea = 25;
        double actual = service.calculateTranscendence(describedArea, nestedArea);
        double expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void isEven_unsignedEvenNumber_true() {
        int number = 2;
        assertTrue(service.isEven(number));
    }

    @Test
    public void isEven_negativeEvenNumber_true() {
        int number = -2;
        assertTrue(service.isEven(number));
    }

    @Test
    public void isEven_zero_false() {
        int number = 0;
        assertFalse(service.isEven(number));
    }

    @Test
    public void isLimitEven_evenArray_true() {
        int[] array = {4, 5, 5, 2, 3};
        assertTrue(service.isLimitEven(array));
    }

    @Test
    public void isLimitEven_numberArray_false() {
        int[] array = {1, 1, 1, 1, 1, 1};
        assertFalse(service.isLimitEven(array));
    }

    @Test
    public void isNumberPerfect_perfectNumber_true() {
        int number = 28;
        assertTrue(service.isNumberPerfect(number));
    }

    @Test
    public void isNumberPerfect_number_false() {
        int number = 29;
        assertFalse(service.isNumberPerfect(number));
    }

    @Test
    public void calculateTime_seconds_localTime() {
        LocalTime actual = service.calculateTime(4605);
        LocalTime expected = LocalTime.of(1, 16, 45);
        assertEquals(actual, expected);
    }

    @Test
    public void nearestPoint_twoPoints_nearestPoint() {
        Point a = new Point(45, 15);
        Point b = new Point(78, 65);
        a.calculateInterval();
        b.calculateInterval();
        Point actual = service.nearestPoint(a, b);
        Point expected = a;
        assertSame(actual, expected);
    }

    @Test
    public void calculateFunction_three_number() {
        double actual = service.calculateFunction(3);
        double expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateFunction_lessThree_number() {
        double actual = service.calculateFunction(0);
        double expected = -0.16666666666666666;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateLengthCircle_radius_lengthCircle() {
        int radius = 5;
        double actual = service.calculateLengthCircle(radius);
        double expected = 31.41592653589793;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateAreaCircle_radius_areaCircle() {
        int radius = 5;
        double actual = service.calculateAreaCircle(radius);
        double expected = 78.53981633974483;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateTangentOnInterval() {
        int begin = 0;
        int end = 250;
        int step = 50;
        List<Double> actual = service.calculateTangentOnInterval(begin, end, step);
        double[] list = {0, 1.192, -5.671, -0.577, 0.364, 2.747};
        List<Double> expected = DoubleStream.of(list).boxed().collect(Collectors.toCollection(ArrayList::new));
        assertEquals(actual, expected);
    }
}
