public class EncomendaNormal{
    private int numPedido;
    private String dataPostagem;
    private double peso;

    //Getters e Setters
    public int getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }
    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //método para calcular o frete
    public double calcularFrete(double precoKg){
        double frete = peso * precoKg;

        return frete;
    }
}