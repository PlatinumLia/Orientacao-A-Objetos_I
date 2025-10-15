public class Passageiro{
    private String nome;
    private int idade;
    private String telefone;
    private String nacionalidade;
    private int numAssento;

    /* get e set do nome */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* get e seet da idade */
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /* get e set fo telefone */
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String t) {
        this.telefone = t;
    }

    /* get e set da nacionalidade */
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nc) {
        this.nacionalidade = nc;
    }

    /* get e set do Nº do assento */
    public int getNumAssento() {
        return numAssento;
    }
    public void setNumAssento(int na) {
        this.numAssento = na;
    }
}

