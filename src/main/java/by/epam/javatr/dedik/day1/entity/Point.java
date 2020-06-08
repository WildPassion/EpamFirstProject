package by.epam.javatr.dedik.day1.entity;

import java.util.StringJoiner;

import static java.lang.Math.hypot;

public class Point implements Comparable<Point> {
    private int x;
    private int y;
    private double interval;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getInterval() {
        return interval;
    }

    public double calculateInterval() {
        if (x == 0) {
            interval = y;
        } else if (y == 0) {
            interval = x;
        } else {
            interval = hypot(x, y);
        }
        return interval;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Point.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .add("interval=" + interval)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;
        return Double.compare(point.interval, interval) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = x;
        result = 31 * result + y;
        temp = Double.doubleToLongBits(interval);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Point point) {
        return Double.compare(this.interval, point.interval);
    }
}
