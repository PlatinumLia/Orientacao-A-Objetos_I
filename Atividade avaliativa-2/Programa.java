import java.io.BufferedWriter;
import java.io.FileWriter;

public class Programa{
    //1 - criar arquivo csv com o nome preco_venda
    //2 - solicitar a margem de lucro
    public static void main(String[] args) throws Exception{
        //criando arquivo de saída
        String nomeArquivoSaida = "preco_venda";
        BufferedWriter arquivoGravacao = new BufferedWriter(new FileWriter(nomeArquivoSaida));

        String linha = "Código;Produto;Preço_venda";
        arquivoGravacao.write(linha); //salvando no arquivo
        arquivoGravacao.newLine(); //vai para a próxima linha
        arquivoGravacao.close(); //termina ("fecha") após gravar tudo
    }
}
