package q3_reta;

public class Main {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(1, 2);
        Ponto2D p2 = new Ponto2D(2, 4);
        Reta y = new Reta(p1, p2); // Correção do construtor

        // RETA PARA VER SE INTERCEDEM
        Reta z = new Reta(new Ponto2D(2, 3), new Ponto2D(4, 5)); // Outra reta z

        // Exibindo o ponto de interseção, se existir
        double[] pontoInterseccao = y.pontoInterseccao(z);
        if (pontoInterseccao != null) {
            System.out.println("Ponto de interseção: (" + pontoInterseccao[0] + ", " + pontoInterseccao[1] + ")");
        } else {
            System.out.println("As retas são paralelas e não se interceptam.");
        }

        // Calculando o valor de y para x = 1 na reta y
        System.out.println("Valor de y quando x = 1: " + y.calcularY(1));

        // Verificando se um ponto (1, 5) está na reta y
        if (!y.PontoNaReta(1, 5)) {
            System.out.println("O ponto não está dentro da reta.");
        } else {
            System.out.println("O ponto está dentro da reta!");
        }
    }
}
