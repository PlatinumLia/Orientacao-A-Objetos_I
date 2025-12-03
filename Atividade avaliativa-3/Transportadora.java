public class Transportadora implements ImportacaoArquivos{
    private EncomendaNormal encomendaNormal[];
    private EncomendaExpressa encomendaExpressa[];

    //Getters e Setters
    /* Encomenda normal */ 
    public EncomendaNormal[] getEncomendaNormal() {
        return encomendaNormal;
    }
    public void setEncomendaNormal(EncomendaNormal[] encomendaNormal) {
        this.encomendaNormal = encomendaNormal;
    }

    /* Encomenda expressa */
    public EncomendaExpressa[] getEncomendaExpressa() {
        return encomendaExpressa;
    }

    public void setEncomendaExpressa(EncomendaExpressa[] encomendaExpressa) {
        this.encomendaExpressa = encomendaExpressa;
    }

    //métodos da Interface "ImportacaoArquivos"
    @Override
    public String carregarConfig(String arqConfig){
        

        return null;
    }

    @Override
    public String importarDados(String arqDadosEntrada){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}