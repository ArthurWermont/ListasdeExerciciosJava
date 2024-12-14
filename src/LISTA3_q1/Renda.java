package LISTA3_q1;

public class Renda implements Tributavel{
    double valor;

    public Renda(double valor) {
            if(valor>0) {
                this.valor=valor;
            }else {
                throw new IllegalArgumentException("O valor da Renda nao pode ser negativo.");
            }
    }

    public double calcularImposto() {
        return valor*0.02;
    }


}