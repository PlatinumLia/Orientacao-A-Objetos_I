public class Caixa{
    private String loginPdv;
    private String senhaPdv;
 
    //construtor
    public Caixa(){}

    /* getters e setters */
    //login pontos de venda
    public String getLoginPdv() {
        return loginPdv;
    }
    public void setLoginPdv(String loginPdv) {
        this.loginPdv = loginPdv;
    }

    //senha pontos de venda
    public String getSenhaPdv() {
        return senhaPdv;
    }
    public void setSenhaPdv(String senhaPdv) {
        this.senhaPdv = senhaPdv;
    }
}