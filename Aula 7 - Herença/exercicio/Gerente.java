public class Gerente extends Funcionario{
    private String area;
    private int nivelAcesso;
    
    //construtor
    public Gerente(){}

    /* getters e setters */
    //área
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    //nível acesso
    public int getNivelAcesso() {
        return nivelAcesso;
    }
    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }   
}