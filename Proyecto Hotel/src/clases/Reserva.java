package clases;

import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private LocalDate fechaReserva;
    private Huesped huesped;
    private Habitacion habitacion;

    public Reserva(int idReserva, String fechaReserva, Huesped huesped, Habitacion habitacion) {
        this.idReserva = idReserva;
        this.fechaReserva = LocalDate.parse(fechaReserva);
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
    public Huesped getHuesped() {
        huesped.datosHuesped();
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = LocalDate.parse(fechaReserva);
    }
    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

//    public void mostrarDatos(){
//        System.out.println("Huesped: " + );
//    }
}
