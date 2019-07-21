package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String triangleName;
    private Integer triangleSideOne;
    private Integer triangleSideTwo;

    public Triangle(String triangleName, int triangleSideOne, int triangleSideTwo) {
        this.triangleName = triangleName;
        this.triangleSideOne = triangleSideOne;
        this.triangleSideTwo = triangleSideTwo;
    }

    public int getTriangleSideOne() {
        return triangleSideOne;
    }

    public Integer getTriangleSideTwo() {
        return triangleSideTwo;
    }

    public String getShapeName(){
        return this.triangleName;
    }

    public int getField(){
        return (getTriangleSideOne() * getTriangleSideTwo()) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return triangleSideOne.equals(triangle.triangleSideOne) &&
                triangleName.equals(triangle.triangleName) &&
                triangleSideTwo.equals(triangle.triangleSideTwo);
    }

    @Override
    public int hashCode() {
        int result = triangleName.hashCode();
        result = 31 * result + triangleSideOne.hashCode();
        result = 31 * result + triangleSideTwo.hashCode();

        return result;
    }

    @Override
    public String toString(){
        return triangleName;
    }
}
