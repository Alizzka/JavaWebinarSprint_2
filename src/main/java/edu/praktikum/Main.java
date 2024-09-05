package edu.praktikum;


import edu.praktikum.factory.SpaceShipFactory;
import edu.praktikum.ships.Dragon;
import edu.praktikum.ships.Proton;
import edu.praktikum.ships.Soyuz;
import edu.praktikum.ships.SpaceShip;

import static edu.praktikum.consts.Consts.GENERATION_1;
import static edu.praktikum.consts.Consts.GENERATION_2;

public class Main {

    public static void main(String[] args) {
        Soyuz soyuz = new Soyuz(2, 3, GENERATION_1);
        Soyuz soyuz2 = new Soyuz(2, 3, GENERATION_2);

        Proton proton = new Proton(4, 5);
        Dragon dragon = new Dragon(3, 7);

        SpaceShip[] ships = { soyuz, proton, dragon };

        SpaceShipFactory spaceShipFactory = new SpaceShipFactory(ships);
        System.out.println(spaceShipFactory.getTotalMonths());
    }
}
