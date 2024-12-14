package q3_reta;

public class Ponto2D {
    int x; // Coordenada x (abscissa)
    int y; // Coordenada y (ordenada)

    // Construtor que inicializa o ponto
    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos de acesso
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ponto2D ponto = (Ponto2D) obj;
        return x == ponto.x && y == ponto.y; // Comparação das coordenadas
    }
}
