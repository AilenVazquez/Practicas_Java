package main;

import clases.Empleado;
import clases.Persona;

public class Main {
    public static void main(String[] args){
        //En el objeto admin1 de tipo administrativo instancie la clase administrativo enviadole datos
        Persona admin1 = new Persona("Ramiro", "Luquez", 35);

        System.out.println(admin1.mostrarDatos()); //Llamo al metodo mostrarDatos del objeto admin1 para mostrar por consola
        admin1.modificarDatos("German", "Olguin", 39);//Llamando al metodo modificarDatos del objeto admin1
        System.out.println(admin1.mostrarDatos());

        admin1.nombre = "Ailen";


        Empleado trabajador1 = new Empleado("Administrativo", 1200000, 6.5, false, "Ramiro", "Luquez", 35);

        System.out.println(trabajador1.mostrarDatos());
    }
}

//Instanciar: crear un objeto atraves de una clase