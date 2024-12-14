package LISTA3_q7;

public class Aluno {
    private String matricula;
    private String nome;
    private double ira;
    private String curso;

    public Aluno(String matricula,String nome,double ira,String curso){
        this.matricula=matricula;
        this.nome=nome;
        this.ira=ira;
        this.curso=curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void ExibirasInformçoes(){
        System.out.println("Matricula: "+matricula+" || Nome: "+nome+" || IRA: "+ira+" || Curso: "+curso+".");
    }
}
