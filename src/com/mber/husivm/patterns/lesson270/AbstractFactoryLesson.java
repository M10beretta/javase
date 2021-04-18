package com.mber.husivm.patterns.lesson270;

// Abstract Factory - фабрика фабрик

public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("CarFactory");
        Factory tankFactory = new AbstractFactory().createFactory("TankFactory");

        Car toyota = carFactory.createCar("Toyota");
        Car audi = carFactory.createCar("Audi");
        Tank t1 = tankFactory.createTank("T1");
        Tank t2 = tankFactory.createTank("T2");

        toyota.drive();
        audi.drive();
        t1.drive();
        t2.drive();
    }
}


class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        return switch (typeOfFactory) {
            case "CarFactory" -> new CarFactory();
            case "TankFactory" -> new TankFactory();
            default -> null;
        };
    }
}

interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

interface Car {
    void drive();
}


class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}


class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        return switch (typeOfCar) {
            case "Toyota" -> new Toyota();
            case "Audi" -> new Audi();
            default -> null;
        };
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}


interface Tank {
    void drive();
}

class T1 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive T1");
    }
}

class T2 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive T2");
    }
}

class TankFactory implements Factory {
    public Tank createTank(String typeOfTank) {
        return switch (typeOfTank) {
            case "T1" -> new T1();
            case "T2" -> new T2();
            default -> null;
        };
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}
