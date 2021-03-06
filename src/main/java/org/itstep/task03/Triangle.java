package org.itstep.task03;

public class Triangle {
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) throws CreateTriangleException {
        if (side1 < side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2){
            throw  new CreateTriangleException("Треугольник нельзя построить");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
