public class Funcionario extends Pessoa{
    private float horasTrabalhadas;
    private float salario;
    private float comissao;
    
    //construtor
    public Funcionario(){}

    /* getters e setters */
    //horas trabalhadas
    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //salário
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    //comissao
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}