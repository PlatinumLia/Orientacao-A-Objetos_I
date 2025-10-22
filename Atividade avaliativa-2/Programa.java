import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Programa{
    //1 - criar arquivo csv com o nome preco_venda
    //2 - solicitar a margem de lucro
    public static void main(String[] args) throws Exception{
        //lendo o arquivo de entrada
        String nomeArquivoEntrada = "preco_custo.csv";
        BufferedReader arquivoLeitura = new BufferedReader(new FileReader(nomeArquivoEntrada));

        //criando arquivo de saída
        String nomeArquivoSaida = "preco_venda.csv";
        BufferedWriter arquivoGravacao = new BufferedWriter(new FileWriter(nomeArquivoSaida));

        //objeto para leitura do teclado
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //variáveis que: 
        // serão usados para armazenar os dados da tabela
        int codigo;
        String nomeProduto;
        float precoVenda;
        int margem;

        System.out.println("Margem de lucro: ");
        margem = Integer.parseInt(reader.readLine());
        //System.out.println("Digitou: " + margemLucro);

        String linha = "codigo;produto;preço_venda";
        arquivoGravacao.write(linha); //salvando no arquivo
        arquivoGravacao.newLine(); //vai para a próxima linha

        //laço para inserir os dados no arquivo
        while((linha = arquivoLeitura.readLine()) != null){
            
        }
        arquivoGravacao.close(); //termina ("fecha") após gravar tudo
    }
}
