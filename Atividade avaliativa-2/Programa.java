import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Programa{
    public static void main(String[] args) throws Exception{
        /* 
        1 - gere um arquivo csv com a lista de preços de venda (preco_venda.csv);
        2 - a lista deve conter: código, nome produto, preço de venda;
        3 - solicitar ao usuário a margem de lucro a ser aplicada aos produtos;
        4 - formato do arquivo de entrada é: codigo, estoque, nome produto, preço de custo e categoria 
        */

        //Passo 1: criar arquivo csv que conterá os dados: codigo, nome, preço venda
        String criarCSV = "preco_venda.csv";
        BufferedWriter venda = new BufferedWriter(new FileWriter(criarCSV));

        //Passo 2: ler o arquivo "preco_custo.csv"
        String lerCSV = "preco_custo.csv";
        BufferedReader custo = new BufferedReader(new FileReader(lerCSV));
        
        //Passo 3: pedir a margem de lucro ao usuário
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Margem de lucro dos produtos: ");
        float margem = Float.parseFloat(reader.readLine());

        //Passo 4: ler o arquivo "preco_venda", inserindo os dados desejados
        String linha = "codigo;produto;preco_venda";
        venda.write(linha);
        
        venda.newLine();
        linha = custo.readLine();
        while((linha = custo.readLine()) != null){
            String vetCampos[] = linha.split(";");
            int codigo = Integer.parseInt(vetCampos[0]);
            String nome = vetCampos[2];
            
            //aplicando a margem de lucro
            float precoCusto = Float.parseFloat(vetCampos[3].replace(",", "."));
            float valorVenda = precoCusto * (1 + margem / 100);
            String precoVenda = String.format("%.2f", valorVenda);
            
            venda.write(codigo + ";" + nome + ";" + precoVenda);
            venda.newLine();
        }
        venda.close();
        custo.close();
    }
}
