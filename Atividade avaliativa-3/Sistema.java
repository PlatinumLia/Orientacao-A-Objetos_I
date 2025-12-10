import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema extends Transportadora {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Transportadora trans = new Transportadora(); // criando um objeto "Transportadora";

    public static void main(String[] args) throws Exception {
        Sistema sys = new Sistema(); // criando um objeto "Sistema"

        Boolean config = false;
        while (config == false) {
            System.out.println("Nome do arquivo de configuração:");
            String arqConfig = reader.readLine();
            config = trans.carregarConfig(arqConfig);
        }

        sys.menu();
    }

    private void menu() throws Exception {
        String opc = "";
        while (!opc.equals("4")) {
            System.out.println("==== SISTEMA DE TRANSPORTADORA ====");
            System.out.println("-----------------------------------------------");
            System.out.println("[1]. Importar arquivo de encomendas.");
            System.out.println("[2]. Exibir a lista de encomendas Normais.");
            System.out.println("[3]. Exibir a lista de encomendas Expressas.");
            System.out.println("[4] Sair.");
            System.out.println("");
            System.out.println("Selecione uma opção:");
            opc = Sistema.reader.readLine();

            switch (opc) {
                case "1":
                    //chamar método importa o arquivo de encomendas
                    System.out.println("==== IMPORTANDO ARQUIVO DE ENCOMENDA ====");
                    System.out.println("Nome do arquivo de encomenda:");
                    String arquivo = reader.readLine();
                    trans.importarDados(arquivo);
                    break;

                case "2":
                    //chama método que lista as encomendas normais
                    listarEncNormal(Sistema.trans);
                    break;

                case "3":
                    //chamar método que lista as encomendas expressas
                    listarEncExpressa(Sistema.trans);
                    break;

                case "4":
                    System.out.println("");
                    System.out.println("SAINDO...");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void listarEncNormal(Transportadora trans) {
        boolean existe = false;

        System.out.println("");
        System.out.println("| Num_pedido | Peso | Frete");
        for (int i = 0; i < trans.getQtdEncNormal(); i++) {
            EncomendaNormal encNormal = trans.getVetEncNormal(i);

            if ((trans.getQtdEncNormal() != 0)) {
                double frete = encNormal.calcularFrete(trans.getPrecoKg());

                String linha = "|     " + String.valueOf(encNormal.getNumPedido()) + "   | " + String.valueOf(encNormal.getPeso()) + " | " + String.valueOf(frete);
                System.out.println(linha);

                existe = true;
            }
        }
        System.out.println("");
        if (!existe) {
            System.out.println("Não há encomendas no vetor!");
            System.out.println("");
        }
    }

    public void listarEncExpressa(Transportadora trans) {
        boolean existe = false;

        System.out.println("");
        System.out.println("| Num_pedido | Peso | Prazo | Frete");
        for (int i = 0; i < trans.getQtdEncExpressa(); i++) {
            EncomendaExpressa encExpressa = trans.getVetEncExpressa(i);

            if ((trans.getQtdEncExpressa() != 0)) {
                String linha = "|     " + String.valueOf(encExpressa.getNumPedido()) + "   | " + String.valueOf(encExpressa.getPeso()) + "  | " + encExpressa.getPrazoEntrega() + " | " + encExpressa.calcularFrete(trans.getPrecoKgExpressa());
                System.out.println(linha);
                existe = true;
            }
        }
        System.out.println("");
        if (!existe) {
            System.out.println("Não há encomendas no vetor!");
            System.out.println("");
        }
    }
}
