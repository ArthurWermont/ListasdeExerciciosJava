package ex1;

public class Aluno {
    private String nome;
    private float AV1;
    private float AV2;

    public void calcularMedia(){
        float media=(AV1+AV2)/2;
        if(media >=7){
            System.out.println("parabens voce foi aprovado.");

        }else{
            System.out.println("parabens voce foi reprovado.");

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAV1() {
        return AV1;
    }

    public void setAV1(float AV1) {
        this.AV1 = AV1;
    }

    public float getAV2() {
        return AV2;
    }

    public void setAV2(float AV2) {
        this.AV2 = AV2;
    }
}
