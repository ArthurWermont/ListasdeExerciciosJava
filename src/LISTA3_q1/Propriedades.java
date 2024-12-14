package LISTA3_q1;

public class Propriedades implements Tributavel {
    double valorP;

    public Propriedades(double valorP) {
        if (valorP > 0) {
            this.valorP = valorP;
        } else {
            throw new IllegalArgumentException("O valor da propriedade não pode ser negativo.");
        }
    }

    @Override
    public double calcularImposto() {
        return valorP * 0.15;
    }
}
