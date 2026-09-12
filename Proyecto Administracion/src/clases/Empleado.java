package clases;

public class Empleado extends Persona{
    private String cargo;
    private double sueldo;
    private double horas;
    private boolean enBlanco = false;

    public Empleado(String cargo, double sueldo, double horas, boolean enBlando, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.horas = horas;
        this.enBlanco = enBlanco;
    }

    public String getCargo() {
        return cargo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public double getHoras() {
        return horas;
    }
    public boolean getEnBlanco() {
        return enBlanco;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void setEnBlanco(boolean enBlanco) {
        this.enBlanco = enBlanco;
    }

    public String renunciar() {
        return "Renuncio al cargo de " + getCargo();
    }

    public void aumento() {
        if (enBlanco) {
            System.out.println("Solicitar un aumento");
        } else {
            System.out.println("Solicitar estar en blanco para solicitar aumento");
        }
    }

    @Override
    public String mostrarDatos(){
        return getNombre() + " " + getApellido() + " de " + getEdad() + " años, ocupa el cargo de " + getCargo();
    }

}

//POLIMORFISMO:
    // Sobreescritura (Overriding): sobreescribimos un metodo de una clase padre y puede incluir su propio contenido modificado4
    // Sobrecarga (Overloading): Es cuando en una misma clase existen varios metodos con un mismo nombre pero que reciben diferentes parametros, el copilador define cual ejecutar segun los argumentos que se le pasen al llamar el metodo.i