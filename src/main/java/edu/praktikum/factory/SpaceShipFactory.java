package edu.praktikum.factory;

import edu.praktikum.ships.SpaceShip;

public class SpaceShipFactory {

    private final SpaceShip[] ships;

    public SpaceShipFactory(SpaceShip[] ships) {
        this.ships = ships;
    }

    public double getTotalMonths() {
        double result = 0;
        for (SpaceShip ship : ships) {
            result += ship.getTotalMonths();
        }
        return result;
    }
}
