public class EncomendaExpressa extends EncomendaNormal{
    private int prazoEntrega;
    private String telefone;

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public double calcularFrete(double precoKg) {
        double frete;

        if(this.prazoEntrega >= 3){ //verifica se o prazo é igual ou maior que 3 dias
            frete = this.getPeso() * precoKg;    
        }else{ //verifica se o prazo é igual ou menor que 2 dias
            frete = (precoKg * this.getPeso()) * 1.25;
        }
        
        return frete;
    }
}
