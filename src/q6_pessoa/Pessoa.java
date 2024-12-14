package q6_pessoa;

public class Pessoa {
    String nome;
    Pessoa pai;
    Pessoa mae;

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome=nome;
        this.pai=pai;
        this.mae=mae;
    }

    public Pessoa(String nome){
        this.nome=nome;
    }
//pedir para o teacher explicar;
    public boolean Igualdade(Pessoa outraPessoa) {
        if (outraPessoa == null) return false; // Verifica se o objeto é nulo
        return this.nome.equals(outraPessoa.nome) &&
                (this.mae != null ? this.mae.nome.equals(outraPessoa.mae != null ? outraPessoa.mae.nome : null) : outraPessoa.mae == null);
    }

}
