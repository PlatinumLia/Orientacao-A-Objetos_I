import java.io.BufferedReader;
import java.io.FileReader;

public class ExLeituraArquivo{
    public static void main(String[] args) throws Exception{
        String nomeArq = "ArquivoEntrada.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArq));

        String linha;
        while((linha = arqLeitura.readLine()) != null){
            System.out.println(linha);
        }
        arqLeitura.close();

        System.out.println("");
        
        arqLeitura = new BufferedReader(new FileReader(nomeArq));
        linha = arqLeitura.readLine();
        while((linha = arqLeitura.readLine()) != null){
            String vetCampos[] = linha.split(";");
            System.out.println("Aluno: " + vetCampos[0]);
        }
        arqLeitura.close();
    }
}