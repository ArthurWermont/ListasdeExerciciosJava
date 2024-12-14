package q2_pessoas;

import java.util.Objects;

public class Ponto2d {

    double pontoX,pontoY;

    public double getPontoX() {
        return pontoX;
    }

    public void setPontoX(double pontoX) {
        this.pontoX = pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }


    public void setPontoY(double pontoY) {
        this.pontoY = pontoY;
    }


    Ponto2d(){
        this.pontoX=0;
        this.pontoY=0;
    }



    Ponto2d(double pontoX, double pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }


    Ponto2d( Ponto2d Outroponto){
        this.pontoX=Outroponto.pontoX;
        this.pontoY=Outroponto.pontoY;

    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }else if(o == null){
            return false;
        }
        Ponto2d ponto2d = (Ponto2d) o;
        return Double.compare(pontoX, ponto2d.pontoX) == 0 && Double.compare(pontoY, ponto2d.pontoY) == 0;
    }


    public double Distancia(Ponto2d Outroponto) {
        double dx= pontoX- Outroponto.pontoX;
        double dy= pontoY- Outroponto.pontoY;
        double distancia= Math.sqrt(Math.pow(dx,2)+dy*dy);
        return distancia;
    }

}