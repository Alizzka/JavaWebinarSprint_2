package edu.praktikum.ships;

public class Dragon extends SpaceShip {

    public Dragon(int amount, double prodMonths) {
        super(amount, prodMonths);
    }

    @Override
    public int getMonthsRisk() {
        return 0;
    }
}
