package main;

import clase.Area;
import clase.CalculadoraInteres;

public class Main {
    public static void main(String[] args){0
        //ejercicio area
        Area calculo = new Area(2.5, 5);

        System.out.println(calculo.calcularAreaRectangulo());

        //erejcicio calcular porcentaje
        CalculadoraInteres interes = new CalculadoraInteres(100, 10);
        System.out.println(interes.calcularInteres(500, 70));



    }
}
