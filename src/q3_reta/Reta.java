package q3_reta;

public class Reta {
    private double angular; // Coeficiente angular
    private double linear;  // Coeficiente linear

    // Construtor que aceita dois pontos
    public Reta(Ponto2D p1, Ponto2D p2) {
        this.angular = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.linear = p1.getY() - (this.angular * p1.getX());
    }

    public double calcularY(double x) {
        return angular * x + linear;
    }

    public boolean PontoNaReta(double x, double y) {
        return y == calcularY(x);
    }

    public double[] pontoInterseccao(Reta outra) {
        if (this.angular == outra.angular) {
            return null; // As retas são paralelas
        }
        double xInterseccao = (outra.linear - this.linear) / (this.angular - outra.angular);
        double yInterseccao = calcularY(xInterseccao);
        return new double[]{xInterseccao, yInterseccao};
    }
}
