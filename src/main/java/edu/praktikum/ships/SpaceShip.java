package edu.praktikum.ships;

public abstract class SpaceShip implements TimeRiskable {

    private final int amount;
    private final double prodMonths;

    public SpaceShip(int amount, double prodMonths) {
        this.amount = amount;
        this.prodMonths = prodMonths;
    }

    public double getTotalMonths() {
        return amount * prodMonths;
    }
}
