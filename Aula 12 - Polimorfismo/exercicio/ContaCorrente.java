public class ContaCorrente{
    private int numConta;
    private String nomeCliente;
    private double saldo;

    //Métodos:
    //depositar uma quantia:
    public float depositar(float quantia){
        return this.saldo = quantia;
    }

    //sacar uma quantia:
    public float sacar(float quantia){
        float valorSaque = (quantia - 0.05f);

        return valorSaque;
    }

    //Getters e Setters
    /* Get e Set do número da conta */
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /* Get e Set do nome do cliente */
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /* Get e Set do saldo */
    public double  getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        boolean resultado = false;
        double taxa = 0.05d;

        if(this.saldo >= valor){

        }
    }
}