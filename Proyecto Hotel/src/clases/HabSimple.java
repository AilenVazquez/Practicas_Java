package clases;

public class HabSimple extends Habitacion{

    public HabSimple(int nroHab, int piso, double precio, double descuento) {
        super(nroHab, piso, precio);
        this.setTipoCama("Simple");
    }



}
