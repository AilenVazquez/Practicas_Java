package clases;

public class Huesped {
    private String nombre;
    private String apellido;
    private int dni;
    private String telefono;
    private String correo;

    //CONSTRUCTOR
    public Huesped(String nombre, String apellido, int dni, String telefono, String correo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDni() {
        return dni;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void datosHuesped(){
        System.out.println("Huesped: "+ getNombre() + " " + getApellido());

    }
}
