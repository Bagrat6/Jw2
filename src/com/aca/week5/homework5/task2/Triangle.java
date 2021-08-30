package com.aca.week5.homework5.task2;

import java.util.Objects;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);
        this.point1 = new ImmutablePoint((ImmutablePoint) point1);
        this.point2 = new ImmutablePoint((ImmutablePoint) point2);
        this.point3 = new ImmutablePoint((ImmutablePoint) point3);
    }

    public Triangle(Triangle triangle){
        AssertionUtils.assertNotNull(triangle);
        this.point1 = new ImmutablePoint((ImmutablePoint) triangle.point1);
        this.point2 = new ImmutablePoint((ImmutablePoint) triangle.point2);
        this.point3 = new ImmutablePoint((ImmutablePoint) triangle.point3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + point1 +
                ", y=" + point2 +
                ", z=" + point3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return this.point1.equals(triangle.point1) && this.point2.equals(triangle.point2) && this.point3.equals(triangle.point3);
    }



}
