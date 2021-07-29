package com.mber.javarush.task.task24.task2406;

/*
Наследование от внутреннего класса
*/

import java.math.BigDecimal;

public class Solution {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }


    public class Apt3Bedroom extends Building.Apartments {
        Apt3Bedroom(Building building) {
            building.super();
        }
    }

    public class BigHall extends Building.Hall {
        BigHall(Building building, BigDecimal square) {
            building.super(square);
        }
    }


    public static void main(String[] args) {

    }
}