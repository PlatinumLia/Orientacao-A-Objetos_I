public class Vendedor {
    //sobrecarga de método / Overload

    //calcula a comissão do vendedor de acordo com a regra:
    // R$20,00 + 5% do valor da venda
    public float calcularComissao(float venda){
        float comissao = (venda * 0.05f) + 20.0f;
        
        return comissao; 
    }

    //calcula a comissão do vendedor de acordo com a regra:
    // percentual variável sobre o valor da venda
    public float calcularComissao(float venda, float percentual){
        float comissao = venda * percentual;
        
        return comissao; 
    }
}