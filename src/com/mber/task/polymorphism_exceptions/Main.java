package com.mber.task.polymorphism_exceptions;

public class Main {
    public static void main(String[] args) {
        double[] triangleSides = {1, 2, 3};
        double[] squareSides = {1, 2, 3, 4};

        printPerimeter(new TriangleGeometryService(), triangleSides);
        printPerimeter(new SquareGeometryService(), squareSides);
    }

    private static void printPerimeter(GeometryService square, double[] sidesSquare) {
        System.out.println(square.perimeter(sidesSquare));
    }
}

interface GeometryService {
    double perimeter(double... nums);
}

class TriangleGeometryService implements GeometryService {
    @Override
    public double perimeter(double... nums) {
        try {
            return nums[0] + nums[1] + nums[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidDataException("Invalid data by TriangleGeometryLibrary");
        }
    }
}

class SquareGeometryService implements GeometryService {
    @Override
    public double perimeter(double... nums) {
        try {
            return nums[0] + nums[1] + nums[2] + nums[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidDataException("Invalid data by SquareGeometryLibrary");
        }
    }
}

class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }
}