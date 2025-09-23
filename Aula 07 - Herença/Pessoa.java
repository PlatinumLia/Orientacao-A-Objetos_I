public class Pessoa{
    private String nome;
    private String email;
    private int idade;

    //construtor vazio
    public Pessoa(){}

    //construtor
    public Pessoa(String n, String e, int i){
        this.nome = n;  //chama do "private String nome" 
        this.email = e; // e assim 
        this.idade = i; // por diante
    }

    /* getters e setters */
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}