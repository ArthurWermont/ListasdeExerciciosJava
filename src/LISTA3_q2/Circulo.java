package LISTA3_q2;

public class Circulo implements AreaCalculavel{
    double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio){
        if (raio < 0) {
            //PERGUNTAR PARA O TEACHER WHAT IS THIS??
            throw new IllegalArgumentException("O raio não pode ser negativo.");
        }else{
        this.raio = raio;
    }
    }

    @Override
    public double calculaArea(){
        double areaC;
        areaC= Math.PI *(raio*raio);
        return areaC;
    }
}
