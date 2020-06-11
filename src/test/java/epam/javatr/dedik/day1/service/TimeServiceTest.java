package epam.javatr.dedik.day1.service;

import by.epam.javatr.dedik.day1.service.TimeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;
import java.time.Month;

import static org.testng.Assert.assertEquals;

public class TimeServiceTest {
    TimeService service;

    @BeforeClass
    public void initialize() {
        service = new TimeService();
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
    public void calculateTime_seconds_localTime() {
        LocalTime actual = service.calculateTime(4605);
        LocalTime expected = LocalTime.of(1, 16, 45);
        assertEquals(actual, expected);
    }
}
