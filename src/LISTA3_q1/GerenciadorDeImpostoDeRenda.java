package LISTA3_q1;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private double totalImposto;
    private List<Tributavel> tributaveis;
    public GerenciadorDeImpostoDeRenda() {
        this.tributaveis = new ArrayList<>();
        this.totalImposto= 0.0;

    }

    public void adicionarT(Tributavel tributavel) {
        tributaveis.add(tributavel);
        totalImposto += tributavel.calcularImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }



}