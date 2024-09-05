package edu.praktikum.ships;

import static edu.praktikum.consts.Consts.GENERATION_1;
import static edu.praktikum.consts.Consts.GENERATION_1_TIME_RISK;

public class Soyuz extends SpaceShip {

    private final String generation;

    public Soyuz(int amount, double prodMonths, String generation) {
        super(amount, prodMonths);
        this.generation = generation;
    }

    @Override
    public int getMonthsRisk() {
        return GENERATION_1.equals(generation) ? GENERATION_1_TIME_RISK : 0;
    }
}
