public class Cliente extends Pessoa{
    private float valorCompra;
    private int qtdItensComprados;
    
    //construtor
    public Cliente(){}

    /*
    //construtor
    public Cliente(float valorC, int qIC, String nome, String cpf, String telefone, int idade){
        this.valorCompra = valorC;
        this.qtdItensComprados = qIC;
        super.setNome(nome);
        super.setCpf(cpf);
        super.setTelefone(telefone);
        super.setIdade(idade);
    }
    */
    /* getters e setters */
    //Valor da compra
    public float getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    //Quant. itens comprados
    public int getQtdItensComprados() {
        return qtdItensComprados;
    }
    public void setQtdItensComprados(int qtdItensComprados) {
        this.qtdItensComprados = qtdItensComprados;
    }
}