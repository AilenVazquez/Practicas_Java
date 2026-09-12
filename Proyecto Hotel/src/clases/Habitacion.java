package clases;

public abstract class Habitacion {
    private int nroHab;
    private int piso;
    private boolean ocupado = false;
    private String tipoCama;
    private double precio;


    //CONSTRUCTOR
    public Habitacion(int nroHab, int piso, double precio) {
        this.nroHab = nroHab;
        this.piso = piso;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    //GETTERS
    public int getNroHab() {
        return nroHab;
    }
    public boolean getOcupado() {
        return ocupado;
    }
    public int getPiso() {
        return piso;
    }
    public String getTipoCama() {
        return tipoCama;
    }
    public double getPrecio() {
        return precio;
    }

    //SETTERS
    public void setNroHab(int nroHab) {
        this.nroHab = nroHab;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
