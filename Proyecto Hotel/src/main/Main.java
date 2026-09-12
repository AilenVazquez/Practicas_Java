package main;

import clases.*;

public class Main {
    public static void main (String[] args){
        Habitacion hab1 = new HabSimple(1,1, 35_700, 10);
        Habitacion hab2 = new HabSimple(2,1, 35_700, 10);
        Habitacion hab3 = new HabSimple(3,1, 35_700, 10);
        Habitacion hab4 = new HabSimple(4,1, 35_700, 10);
        Habitacion hab5 = new HabSimple(5,1, 35_700, 10);

        Habitacion hab6 = new HabSuite(6, 1, 65_300, 2, true,true);
        Habitacion hab7 = new HabSuite(7, 1, 65_300, 2, true,true);

        Huesped huesped1 = new Huesped("Ramiro", "Luquez", 35936441, "2615534575", "ramiroluquez@gmail.com");

        Reserva reserva1 = new Reserva(1,"2026-07-12", huesped1, hab1);

//        reserva1.mostrarDatos();

    }
}
