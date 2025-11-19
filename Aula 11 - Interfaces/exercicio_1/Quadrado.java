public class Quadrado implements FormaGeometrica{
    public float ladoUm;
    public float ladoDois;
    
    public float calcularArea(){
        return (getLadoUm() * getLadoDois());
    }

    //Getters e setters
    //lado um
    public float getLadoUm() {
        return ladoUm;
    }
    public void setLadoUm(float ladoUm) {
        this.ladoUm = ladoUm;
    }

    //lado dois
    public float getLadoDois() {
        return ladoDois;
    }
    public void setLadoDois(float ladoDois) {
        this.ladoDois = ladoDois;
    }
}
