import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ProgramaV2 {
    public static void main(String[] args) throws Exception{
        //lendo o arquivo de entrada
        String arqEntrada;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nome do arquivo de entrada (coloque '.csv' no final):");
        arqEntrada = reader.readLine();
        if(arqEntrada.equals("")){ //verifica o nome do arquivo de entrada
            arqEntrada = "preco_custo.csv"; //caso não tenha dado um nome, usa o arquivo "preco_custo" como padrão
        }
        BufferedReader custo = new BufferedReader(new FileReader(arqEntrada));
        
        //criando o arquivo csv de saída
        String arqSaida;
        System.out.println("Nome do arquivo de saída (coloque '.csv' no final):");
        reader = new BufferedReader(new InputStreamReader(System.in));
        arqSaida = reader.readLine();
        if(arqSaida.equals("")){ //verifica se o usuário deu um nome
                                // ao arquivo de saída
            arqSaida = "preco_venda.csv"; //caso não tenha dado um nome, usa "preco_venda.csv" como padrão
        }
        BufferedWriter venda = new BufferedWriter(new FileWriter(arqSaida)); //criando o arquivo
        String linha = "codigo;produto;preco_venda";
        venda.write(linha);
        venda.newLine();
        
        //criando o arquivo csv de compra
        String arqCompra = "comprar.csv";
        BufferedWriter compra = new BufferedWriter(new FileWriter(arqCompra)); //criando o arquivo
        String linhaCompra = "codigo;estoque;produto;preco_custo;categoria";
        compra.write(linhaCompra);
        compra.newLine();

        reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Margem de lucro dos produtos: ");
        float margem = Float.parseFloat(reader.readLine());
        
        linha = custo.readLine();
        while((linha = custo.readLine()) != null){
            String vetCampos[] = linha.split(";");
            int codigo = Integer.parseInt(vetCampos[0]);
            int estoque = Integer.parseInt(vetCampos[1]);
            String nome = vetCampos[2];
            float precoCusto = Float.parseFloat(vetCampos[3].replace(",", "."));
            String categoria = vetCampos[4];
            
            //aplicando a margem de lucro
            float valorVenda = precoCusto * (1 + margem / 100);
            String precoVenda = String.format("%.2f", valorVenda);
            linha = codigo + ";" + nome + ";" + precoVenda;
            venda.write(linha);
            venda.newLine();

            if(estoque < 10){ //verifica a quantidade de itens no estoque
                             // caso tenha menos que 10, salva os dados no arquivo "comprar.csv"
                linhaCompra = codigo + ";" + estoque + ";" + nome + ";" + precoCusto + ";" + categoria;
                compra.write(linhaCompra);
                compra.newLine();
            }
        }
        //fecha os arquivos depois de salvar e ler os dados
        venda.close();
        compra.close();
        custo.close();
    }
}
