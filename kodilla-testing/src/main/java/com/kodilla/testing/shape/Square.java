package com.kodilla.testing.shape;

public class Square implements Shape{

    private String squareName;
    private Integer squareSide;

    public Square(String squareName, int squareSide) {
        this.squareName = squareName;
        this.squareSide = squareSide;
    }

    public String getSquareName() {
        return squareName;
    }

    public int getSquareSide() {
        return squareSide;
    }

    public String getShapeName(Object o){
        Square square = (Square) o;
        return square.getSquareName();
    }

    public int getField(Object o){
        return squareSide * squareSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return squareSide.equals(square.squareSide) &&
                squareName.equals(square.squareName);
    }

    @Override
    public int hashCode() {
        int result = squareName.hashCode();
        result = 31 * result + squareSide.hashCode();

        return result;
    }


    @Override
    public String toString(){
        return squareName;
    }
}
