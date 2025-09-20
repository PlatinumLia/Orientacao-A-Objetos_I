public class Vendedor extends Funcionario{
    private int qtdVendas;
    private int qtdItensVendidos;
    
    //construtor
    public Vendedor(){}

    /* getters e setters */
    //quant. vendas
    public int getQtdVendas() {
        return qtdVendas;
    }
    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    //quant. itens vendidos
    public int getQtdItensVendidos() {
        return qtdItensVendidos;
    }
    public void setQtdItensVendidos(int qtdItensVendidos) {
        this.qtdItensVendidos = qtdItensVendidos;
    }   
}