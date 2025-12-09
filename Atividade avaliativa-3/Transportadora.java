import java.io.BufferedReader;
import java.io.FileReader;

public class Transportadora implements ImportacaoArquivos{
    private int qtdEncNormal;
    private int qtdEncExpressa;
    private double precoKg;
    private double precoKgExpressa;
    private EncomendaNormal vetEncNormal[];
    private EncomendaExpressa vetEncExpressa[];

    /* Métodos */
    //método construtor
    public Transportadora(){
        this.vetEncNormal = new EncomendaNormal[1000];
        this.vetEncExpressa = new EncomendaExpressa[1000];
        this.qtdEncNormal = 0;
        this.qtdEncExpressa = 0;
    }
    
    
    //Getters e Setters
    /* Get e Set da quantidade de encomendas normais */
    public int getQtdEncNormal() {
        return qtdEncNormal;
    }
    public void setQtdEncNormal(int qtdEncNormal) {
        this.qtdEncNormal = qtdEncNormal;
    }

    /* Get e Set do preco por kg de encomendas normais */
    public double getPrecoKg() {
        return precoKg;
    }
    public void setPrecoKg(double precoKg) {
        this.precoKg = precoKg;
    }
    
    /* Get e Set do preco por kg de encomendas expressas */
    public double getPrecoKgExpressa() {
        return precoKgExpressa;
    }
    public void setPrecoKgExpressa(double precoKgExpressa) {
        this.precoKgExpressa = precoKgExpressa;
    }

    /* Get e Set da quantidade de encomendas expressas */
    public int getQtdEncExpressa() {
        return qtdEncExpressa;
    }
    public void setQtdEncExpressa(int qtdEncExpressa) {
        this.qtdEncExpressa = qtdEncExpressa;
    }

    /* Get e Set das encomendas normais no vetor */
    public EncomendaNormal getVetEncNormal(int pos) {
        return vetEncNormal[pos];
    }
    public void setVetEncNormal(EncomendaNormal encNormal) {
        if(this.qtdEncNormal < 10000){
            this.vetEncNormal[qtdEncNormal] = encNormal;
            qtdEncNormal++;
        }
    }

    /* Get e Set das encomendas expressas no vetor */
    public EncomendaExpressa getVetEncExpressa(int pos) {
        return vetEncExpressa[pos];
    }
    public void setVetEncExpressa(EncomendaExpressa encExpressa) {
        if(this.qtdEncExpressa < 1000){
            this.vetEncExpressa[qtdEncExpressa] = encExpressa;
            qtdEncExpressa++;
        }
    }

    //métodos da Interface "ImportacaoArquivos"
    @Override
    public Boolean carregarConfig(String arqConfig){
        try { //tenta executar se o arquivo existe
            BufferedReader reader = new BufferedReader(new FileReader(arqConfig + ".csv"));
            String linha = reader.readLine();
                
            while((linha = reader.readLine()) != null){
                String vetCampos[] = linha.split(";");
                String sigla = vetCampos[1];

                if (sigla.equals("EN")) {
                    this.setPrecoKg(Double.parseDouble(vetCampos[2]));
                }else if(sigla.equals("EE")){
                    this.setPrecoKgExpressa(Double.parseDouble(vetCampos[2]));
                }
            }
            reader.close();
            System.out.println("");
            System.out.println("Arquivo de configurações importado com sucesso!");
            System.out.println("");
            return true;
        } catch (Exception e){ //caso não encontre o arquivo
            System.out.println("");
            System.out.println("ERRO: " + e.getMessage());
            System.out.println("");

            return  false;
        }
    }

    @Override
    public void importarDados(String arqDadosEntrada){
        try{ //tentando ler o arquivo
            BufferedReader arquivo = new BufferedReader(new FileReader(arqDadosEntrada + ".csv"));
            String linha = arquivo.readLine();

            while((linha = arquivo.readLine()) != null){
                String vetCampos[] = linha.split(";");
                String sigla = vetCampos[2]; //usado para definir qual o tipo de encomenda

                if((sigla.equals("EN")) && getQtdEncNormal() < 1000){ //se for encomenda "EN", salva no vetor de encomendas normais
                    EncomendaNormal encNormal = new EncomendaNormal();
                    encNormal.setNumPedido(Integer.parseInt(vetCampos[0]));
                    encNormal.setDataPostagem(vetCampos[1]);
                    encNormal.setPeso(Double.parseDouble(vetCampos[4]));
                    this.setVetEncNormal(encNormal);
                }
                
                if((sigla.equals("EE")) && getQtdEncExpressa() < 10000){
                    EncomendaExpressa encExpressa = new EncomendaExpressa();
                    encExpressa.setNumPedido(Integer.parseInt(vetCampos[0]));
                    encExpressa.setDataPostagem(vetCampos[1]);
                    encExpressa.setPrazoEntrega(Integer.parseInt(vetCampos[3]));
                    encExpressa.setPeso(Double.parseDouble(vetCampos[4]));
                    encExpressa.setTelefone(vetCampos[5]);
                    this.setVetEncExpressa(encExpressa);
                }
            }
            arquivo.close();
            System.out.println("");
            System.out.println("Arquivo importado com sucesso!");
            System.out.println("");
        }catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }

}