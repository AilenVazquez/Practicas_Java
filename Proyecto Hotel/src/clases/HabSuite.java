package clases;

public class HabSuite extends Habitacion{
    private int cantBano;
    private boolean jaccuzzi;
    private boolean roomService;

    //CONSTRUCTOR
    public HabSuite (int nroHab, int piso,double precio, int cantBano, boolean jaccuzzi, boolean roomService){
        super(nroHab, piso, precio);
        this.cantBano = cantBano;
        this.jaccuzzi = jaccuzzi;
        this.roomService = roomService;
        this.setTipoCama("Doble");
    }

    //GETTERS
    public int getCantBano() {
        return cantBano;
    }
    public boolean getJaccuzzi() {
        return jaccuzzi;
    }
    public boolean getRoomService() {
        return roomService;
    }

    //SETTERS
    public void setCantBano(int cantBano) {
        this.cantBano = cantBano;
    }
    public void setJaccuzzi(boolean jaccuzzi) {
        this.jaccuzzi = jaccuzzi;
    }
    public void setRoomService(boolean roomService) {
        this.roomService = roomService;
    }
}
