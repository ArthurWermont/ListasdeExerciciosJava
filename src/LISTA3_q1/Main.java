package LISTA3_q1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

            System.out.println("Digite a renda 1:");
            double quantR1 = teclado.nextDouble();
            Renda renda1 = new Renda(quantR1);

            System.out.println("Digite a propriedade 1:");
            double quantP1 = teclado.nextDouble();
            Propriedades propriedade1 = new Propriedades(quantP1);

            System.out.println("Digite a renda 2:");
            double quantR2 = teclado.nextDouble();
            Renda renda2 = new Renda(quantR2);

            System.out.println("Digite a propriedade 2:");
            double quantP2 = teclado.nextDouble();
            Propriedades propriedade2 = new Propriedades(quantP2);


            gerenciador.adicionarT(renda1);
            gerenciador.adicionarT(renda2);


            gerenciador.adicionarT(propriedade1);
            gerenciador.adicionarT(propriedade2);


            System.out.println("O total de impostos a ser pago sera: " + gerenciador.getTotalImposto());
        } catch (Exception e) {
        System.out.println("Ocorreu um Erro: "+e.getMessage());
    }
    }

}
