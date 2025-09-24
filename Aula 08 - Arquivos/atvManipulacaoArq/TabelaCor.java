import java.io.BufferedWriter;
import java.io.FileWriter;

public class TabelaCor{
    public static void main(String[] args) throws Exception{
        String arqSaidaCores = "saidaCores.html";
        BufferedWriter gravacaoCores = new BufferedWriter(new FileWriter(arqSaidaCores));

        String linha = "";
        gravacaoCores.write(linha); //salva no arquivo
        gravacaoCores.newLine(); //vai pra próxima linha
    }
}