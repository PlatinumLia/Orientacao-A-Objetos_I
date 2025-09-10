public class Voo{
    private String numVoo;
    private String áreaDeEmbarque;
    private String destinoFinal;
    private int qtdPassageiros;
    private Passageiro[] vetPassageiros;

    /* get e set do Nº do vôo */
    public String getNumVoo() {
        return numVoo;
    }
    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    /* get e set da área de embarque */
    public String getÁreaDeEmbarque() {
        return áreaDeEmbarque;
    }
    public void setÁreaDeEmbarque(String áreaDeEmbarque) {
        this.áreaDeEmbarque = áreaDeEmbarque;
    }

    /* get e set do destino final */
    public String getDestinoFinal() {
        return destinoFinal;
    }
    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    /* get e set da quantidade de passageiros */
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    /* get e set do vetor de passageiros */
    public Passageiro getPassageiros(int pos) {
        return vetPassageiros[pos];
    }
    public void setPassageiros(Passageiro p) {
        if(this.qtdPassageiros < 50){
            this.vetPassageiros[qtdPassageiros] = p;
            qtdPassageiros++;
        }
    }

    
}
