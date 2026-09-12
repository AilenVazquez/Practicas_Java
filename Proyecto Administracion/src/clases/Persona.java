package clases;

public class Persona {
    // -----------ATRIUBTOS------------
    public String nombre;
    private String apellido;
    private int edad;

    // -----------CONSTRUCTOR-----------
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //--------------METODOS-----------------
    //Los metodos son funciones, algunas ya programadas y otras pueden crearse desde 0 como los metodos propios

    //Metodos Getter: Para retornar los valores de los atributos
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    //Metodos Setter: Para modificar valores de los atributos
    public String setNombre(String name){
        this.nombre = name;
        return name;
        //Aqui podemos devolder el nuevo valor agregado cambiando el void por el String y usando un return
    }

    public void setApellido(String surname) {
        this.apellido = surname;
    }

    public void setEdad(int years) {
        this.edad = years;
    }

    //Metodos propios
    public String mostrarDatos(){
        return getNombre() + " " + getApellido() + " de " + getEdad() + " años";
    }

    public void modificarDatos(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        System.out.println(mostrarDatos());
    }
}

//ENCAPSULAR: Tener los atributos privados y los metodos publicos, de esta manera solo se puede acceder a los atributos atraves de los metodos y no sin permiso.

//HERENCIA: Es cuando una clase hija (subclase) accede a todos los atributos y metodos de la clase padre (superclase)