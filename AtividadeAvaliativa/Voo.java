public class Voo{
    private int  numVoo;
    private String areaDeEmbarque;
    private String destinoFinal;
    private int qtdPassageiro;
    private Passageiro[] vetPassageiros;

    public Voo(){
        this.vetPassageiros = new Passageiro[50];
    }

    /* get e set do Nº do vôo */
    public int getNumVoo() {
        return numVoo;
    }
    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    /* get e set da área de embarque */
    public String getAreaDeEmbarque() {
        return areaDeEmbarque;
    }
    public void setAreaDeEmbarque(String areaDeEmbarque) {
        this.areaDeEmbarque = areaDeEmbarque;
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
        return qtdPassageiro;
    }
    public void setQtdPassageiros(int qtdPassageiro) {
        this.qtdPassageiro = qtdPassageiro;
    }

    /* get e set do vetor de passageiros */
    public Passageiro getPassageiro(int pos) {
        return vetPassageiros[pos];
    }
    public void setPassageiro(Passageiro p) {
        if(this.qtdPassageiro < 50){
            this.vetPassageiros[qtdPassageiro] = p;
            qtdPassageiro++;
        }
    }

    public int qtdAssentosLivres(){
        int assentos = 50;
        return (assentos - this.qtdPassageiro);
    }
}
