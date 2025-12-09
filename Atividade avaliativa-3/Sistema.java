import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema extends Transportadora {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws Exception {
        Transportadora trans = new Transportadora(); // criando um objeto "Transportadora";
        Sistema system = new Sistema(); // criando um objeto "Sistema"
    
        Boolean config = false;
        while(config == false){
            System.out.println("Nome do arquivo de configuração:");
            String arqConfig = reader.readLine();
            config = trans.carregarConfig(arqConfig);
        }

        system.menu(trans);
    }

    private void menu(Transportadora trans) throws Exception{
        String opc = "";
        while(!opc.equals("4")){
            System.out.println("-------------------------------");
            System.out.println("[1]. Importar arquivo de encomendas.");
            System.out.println("[2]. Exibir a lista de encomendas Normais.");
            System.out.println("[3]. Exibir a lista de encomendas Expressas.");
            System.out.println("[4] Sair.");
            System.out.println("");
            System.out.println("Selecione uma opção:");
            opc = this.reader.readLine();
            
            switch(opc){
                case "1":
                    //chamar método importa o arquivo de encomendas
                    importarArquivoEncomenda();
                    
                
                case "2": 
                    //chama método que lista as encomendas normais
                    listarEncNormal(trans);
                    break;
                    
                case "3": 
                    //chamar método de consulta de vôo
                    

                case "4":
                    System.out.println("SAINDO...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void importarArquivoEncomenda() throws Exception{
        Transportadora trans = new Transportadora();
        System.out.println("Nome do arquivo de encomendas:");
        String arquivo = reader.readLine();

        trans.importarDados(arquivo);

    }

    public void listarEncNormal(Transportadora trans){
        if((trans.getQtdEncNormal() != 0)){
            System.out.println("Num_pedido | Peso | Valor_frete");
            for(int i = 0; i < trans.getQtdEncNormal(); i++){
                EncomendaNormal encNormal = trans.getVetEncNormal(i);
                double frete = encNormal.calcularFrete(trans.getPrecoKg());
                System.out.printf("%10d | %5.2f | %5.2f", encNormal.getNumPedido(), encNormal.getPeso(), frete);
            }
        }
    }
}