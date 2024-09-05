package edu.praktikum.ships;

public class Proton extends SpaceShip {

    public Proton(int amount, double prodMonths) {
        super(amount, prodMonths);
    }

    @Override
    public int getMonthsRisk() {
        return 2;
    }
}
