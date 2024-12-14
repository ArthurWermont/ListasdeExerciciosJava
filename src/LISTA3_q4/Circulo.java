    package LISTA3_q4;

    public class Circulo {
        double raio;
        String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        public Circulo(String nome,double raio){
            this.nome=nome;
            if (raio < 0) {
                throw new IllegalArgumentException("O raio não pode ser negativo.");
            }else{
                this.raio = raio;
            }
        }
        public double Area( ){
            double area = Math.PI*(raio*raio);
            return area;
        }
    }
