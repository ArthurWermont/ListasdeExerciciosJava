package LISTA3_q2;

public class Retangulo implements AreaCalculavel{
    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public Retangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calculaArea(){
        return base*altura;
    }

}
