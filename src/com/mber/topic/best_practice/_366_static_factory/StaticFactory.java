package com.mber.topic.best_practice._366_static_factory;

import java.math.BigInteger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//static factory methods vs constructors

//advantages
//1. name
//2. cache
//3. inheritance
//disadvantages
//1. cant subclass if all constructors private
//2. not intuitive
public class StaticFactory {
    public static void main(String[] args) throws SQLException {

        //examples
        BigInteger bigInteger1 = new BigInteger(1, 2, new Random());
        BigInteger.probablePrime(1, new Random());
        DriverManager.getConnection("");

        Car sportCar = Car.getSportCar();
        Car whiteСar = Car.getColorCar("white");
    }
}

class Car {
    private String color;
    private int doors;

    private static Map<String, Car> cache = new HashMap<>();

    protected Car() {
    }

    private Car(String color) {
        this.color = color;
    }

    private Car(int doors) {
        this.doors = doors;
    }

    //1
    public static Car getSportCar() {
        return new Car(2);
    }
    //2
    public static Car getColorCar(String color) {
        if (cache.containsKey(color)) return cache.get(color);
        else return cache.put(color, new Car(color));
    }
    //3
    public static Car getFerrari() {
        return new Ferrari();
    }
}

class Ferrari extends Car {

}