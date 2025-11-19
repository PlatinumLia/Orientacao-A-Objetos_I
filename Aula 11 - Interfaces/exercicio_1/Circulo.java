public class Circulo implements FormaGeometrica{
    private float raio;
    private float pi = (float) 3.14;

    public float calcularArea(){
        return (pi * (raio * raio));
    }

    //Getters e Setters
    //raio
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
}
