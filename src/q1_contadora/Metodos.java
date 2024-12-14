package q1_contadora;

public class Metodos {
    private int valor;

    public int getValor() {
        return valor;
    }
    public int setValor(int valor) {
        this.valor = valor;

        return this.valor;
    }

    public void Incrementar() {

        valor++;
    }

    public void Zerar(){

        valor=0;
    }

}