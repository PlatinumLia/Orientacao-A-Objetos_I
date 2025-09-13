public class Compania {
    private String nome;
    private String telefone;
    private int qtdVoo;
    private Voo[] vetVoo;

    public Compania(){
        this.vetVoo = new Voo[10];
    }

    /* get e set do nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* get e set do telefone */
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /* get e set da quantidade de vôos*/
    public int getQtdVoo() {
        return qtdVoo;
    }
    public void setQtdVoo(int qtdVoo) {
        this.qtdVoo = qtdVoo;
    }

    /* get e set do array de vôos */
    public Voo getVoo(int pos) {
        return vetVoo[pos];
    }
    public void setVoo(Voo v) {
        if(this.qtdVoo < 10){
            this.vetVoo[qtdVoo] = v;
            qtdVoo++;
        }
    }
}
