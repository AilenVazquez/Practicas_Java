package clase;

public class Area {
    private double base;
    private double altura;

    public Area (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaRectangulo(){
        return base * altura;
    }
}
