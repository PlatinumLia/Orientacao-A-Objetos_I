public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    
    //contrutor
    public Pessoa(){}

    /*
    //construtor
    public Pessoa(String n, String c, String t, int i){
        this.nome = n;
        this.cpf = c;
        this.telefone = t;
        this.idade = i;
    }
    */
    
    /* getters e setters */
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //cpf
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
