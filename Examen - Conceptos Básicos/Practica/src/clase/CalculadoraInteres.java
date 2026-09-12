package clase;

public class CalculadoraInteres {
    private double monto;
    private double porcentaje;

    public CalculadoraInteres(double monto, double porcentaje){
        this.monto = monto;
        this.porcentaje = porcentaje;
    }

    public double calcularInteres(double monto){
        return monto * 0.10;
    }

    public double calcularInteres(double monto, double porcentaje){
        return monto * porcentaje / 100;
    }
}
