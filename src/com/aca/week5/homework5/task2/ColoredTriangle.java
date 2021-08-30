package com.aca.week5.homework5.task2;

import java.util.Objects;

public class ColoredTriangle extends Triangle{
    private Color color;

    public ColoredTriangle(Point point1, Point point2, Point point3, Color color) {
        super(point1, point2, point3);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColoredTriangle{" +
                "color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        if(triangle instanceof ColoredTriangle){
            return super.equals(triangle) && color.equals(((ColoredTriangle) triangle).color);
        }
        return super.equals(triangle);
    }



    public static void main(String[] args) {
        Point point1 = new ImmutablePoint(1,1);
        Point point2 = new ImmutablePoint(2,2);
        Point point3 = new ImmutablePoint(3,3);
        Color color = Color.BLACK;
        Color color1 = Color.WHITE;
        ColoredTriangle coloredTriangle = new ColoredTriangle(point1,point2,point3,color);
        ColoredTriangle coloredTriangle1 = new ColoredTriangle(point1,point2,point3,color);
        if(coloredTriangle.equals(coloredTriangle1)){
            System.out.println("Colored Triangles are equal.");
        }
        Triangle triangle = new Triangle(point1,point2,point3);
        if(coloredTriangle.equals(triangle)){
            System.out.println("Triangles are equal.");
        }
    }
}
