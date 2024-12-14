package q4_circulo;

public class circulo {
    double raio;
    double ponto;

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getPonto() {
        return ponto;
    }
    public void setPonto(double ponto) {
        this.ponto = ponto;
    }

    public circulo(double raio,double ponto ) {
        this.raio=raio;
        this.ponto=ponto;
    }

    public circulo (double raio){
        this.raio=raio;
    }

    public void Inflar() {
        raio=raio+10;
        System.out.println("o raio da circunferencia agora é: "+ raio);
    }

    public void Desinflar() {
        raio=raio-10;
        System.out.println("o raio da circunferencia agora é: "+ raio);
    }

    public void Area() {
        double area;
        area= 3.14*(raio*raio);
        System.out.println("a area da circunferencia é: "+ area);

    }


}