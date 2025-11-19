public class Retangulo implements FormaGeometrica{
    private float base;
    private float altura;

    public float calcularArea(){
        return ((getBase() * getAltura()) / 2);
    }

    //Getters e Setters
    //base
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    //altura
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
