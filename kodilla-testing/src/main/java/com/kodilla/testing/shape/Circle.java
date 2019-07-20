package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String circleName;
    private Integer radius;

    public Circle(String circleName, int radius) {
        this.circleName = circleName;
        this.radius = radius;
    }

    public String getCircleName() {
        return circleName;
    }

    public int getRadius() {
        return radius;
    }

    public String getShapeName(Object o){
        Circle circle = (Circle) o;
        return circle.getCircleName();
    }

    public int getField(Object o){
        return 3 * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle square = (Circle) o;
        return radius.equals(square.radius) &&
                circleName.equals(square.circleName);
    }

    @Override
    public int hashCode() {
        int result = circleName.hashCode();
        result = 31 * result + radius.hashCode();

        return result;
    }

    @Override
    public String toString(){
        return circleName;
    }

}
