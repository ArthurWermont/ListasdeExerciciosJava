package q5_pais;

public class Pais {

    String ISO;
    String nome;
    double dimensão;
    double população;

    public double getPopulação() {
        return população;
    }

    public void setPopulação(double população) {
        this.população = população;
    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String iSO) {
        ISO = iSO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensão() {
        return dimensão;
    }

    public void setDimensão(double dimensão) {
        this.dimensão = dimensão;
    }

    public Pais(String ISO, String nome, double dimensão) {
        this.ISO = ISO;
        this.nome = nome;
        this.dimensão = dimensão;
    }

    public boolean isIgual(Pais outroPais) {
        return this.ISO.equals(outroPais.ISO);
    }

    public void Densidade() {
        if (dimensão > 0) { // Verifica se a dimensão é válida
            double densidade = população / dimensão;
            System.out.println("A densidade do país " + nome + " é: " + densidade + " habitantes por km²");
        } else {
            System.out.println("Dimensão do país " + nome + " é inválida para calcular densidade.");
        }
    }
}