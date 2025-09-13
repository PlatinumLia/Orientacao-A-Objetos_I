import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaCompanhia{
    BufferedReader reader;
    Compania comp;
    public static void main(String[] args) throws Exception{
        SistemaCompanhia sc = new SistemaCompanhia();
        sc.comp = new Compania();
        sc.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nome da compania aérea:");
        sc.comp.setNome(sc.reader.readLine());

        System.out.println("Telefone:");
        sc.comp.setTelefone(sc.reader.readLine());

        sc.menu();
    }
    
    private void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){
            System.out.println("-------------------------------");
            System.out.println("[1] Cadastrar vôo.");
            System.out.println("[2] Listar vôos existentes.");
            System.out.println("[3] Consultar um vôo.");
            System.out.println("[4] Sair.");
            System.out.println("");
            System.out.println("Selecione uma opção:");
            opcao = this.reader.readLine();

            switch(opcao){
                case "1" -> 
                    //chamar método que cadastra um vôo
                    CadastrarVoo();
                
                case "2" -> 
                    //chama método que lista um vôo
                    ListarVoo();

                case "3" -> 
                    //chamar método de consulta de vôo
                    ConsultarVoo();

                case "4" -> System.out.println("Saindo...");

                default -> {
                }
            }
        }
    }

    private void CadastrarVoo() throws Exception{
        Voo v = new Voo();

        System.out.println("--- CADASTRAR VÔO ---");
        System.out.println("Número do vôo:");
        v.setNumVoo(Integer.parseInt(reader.readLine()));

        System.out.println("Área de embarque:");
        v.setAreaDeEmbarque(reader.readLine());

        System.out.println("Destino final:");
        v.setDestinoFinal(reader.readLine());

        //registrando os passageiros
        System.out.println("--- PASSAGEIROS ---");
        for(int i=0; i<50; i++){
            System.out.println("Nome:");
            String nome = reader.readLine();
            if(nome.equals("")){
                break;
            }
            Passageiro passageiro = new Passageiro();
            passageiro.setNome(nome);
            
            System.out.println("Idade:");
            passageiro.setIdade(Integer.parseInt(reader.readLine()));
            System.out.println("Telefone:");
            passageiro.setTelefone(reader.readLine());
            System.out.println("Nacionalidade:");
            passageiro.setNacionalidade(reader.readLine());
            System.out.println("Nº do assento:");
            passageiro.setNumAssento(Integer.parseInt(reader.readLine()));

            v.setPassageiro(passageiro);
        }
        comp.setVoo(v);
    }

    private void ListarVoo() throws Exception{
        System.out.println("-----------------------");
        System.out.println(" | RELATÓRIO DE VÔOS |");
        for(int i=0; i<comp.getQtdVoo(); i++){
            Voo v = comp.getVoo(i);
            System.out.println(" | Número do vôo: " + v.getNumVoo() + " | Área de embarque: " + v.getAreaDeEmbarque() + " | Destino final: " + v.getDestinoFinal() + " | Qtd. de passageiros: " + v.getQtdPassageiros() + " | Qtd. assentos livres: " + v.qtdAssentosLivres());
        }
    }

    private void ConsultarVoo() throws Exception{
         System.out.println("--------------------");
        System.out.println(" | CONSULTA DE VÔOS |");
        System.out.println("Número do vôo:");
        int numVoo = Integer.parseInt(reader.readLine());
        boolean existe = false;

        for(int i=0; i<comp.getQtdVoo(); i++){
            Voo v = comp.getVoo(i);
            if(v.getNumVoo() == numVoo){
                System.out.println("| PASSAGEIROS DO VÔO |");
                int posicaoPassageiro = 0;
                while(v.getPassageiro(posicaoPassageiro) != null){
                    String linha = " | Nome: " + v.getPassageiro(posicaoPassageiro).getNome();
                    linha += " | Idade: " + v.getPassageiro(posicaoPassageiro).getIdade();
                    linha += " | Telefone: " + v.getPassageiro(posicaoPassageiro).getTelefone();
                    linha += " | Nacionalidade: " + v.getPassageiro(posicaoPassageiro).getNacionalidade();
                    linha += " | Nº do assento: " + v.getPassageiro(posicaoPassageiro).getNumAssento();
                    System.out.println(linha);
                    posicaoPassageiro++;
                }
                existe = true;
                break;
            }
        }
        if(!existe){
            System.out.println("Vôo não encontrado!");
        }
    }
}