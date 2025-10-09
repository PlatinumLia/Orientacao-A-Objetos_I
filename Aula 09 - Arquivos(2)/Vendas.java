import java.io.BufferedReader;
import java.io.FileReader;

public class Vendas{
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) throws Exception{
        String nomeArq = "vendas.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArq));

        arqLeitura = new BufferedReader(new FileReader(nomeArq));
        
        String venda;
        venda = arqLeitura.readLine();
        int i = 0;
        float soma = 0;
        float somaVista = 0;
        float somaPrazo = 0;

        while((venda = arqLeitura.readLine()) != null){
            //valor total das vendas
            String[] vetVenda = venda.split(";");
            soma += Float.parseFloat(vetVenda[2].replace(",", "."));
            
            //valor total das vendas à vista
            if(vetVenda[3].equals("V")){
                somaVista += Float.parseFloat(vetVenda[2].replace(",", "."));
            }else{//valor total das vendas à prazo
                somaPrazo += Float.parseFloat(vetVenda[2].replace(",", ".")); 
            }
            i++;//quantidade de vendas realizadas
        }
        arqLeitura.close();
        System.out.println("Quantidade total de vendas: " + i);
        System.out.println("Total de todas as vendas: " + soma);
        System.out.println("Total de vendas à vista: " + somaVista);
        System.out.println("Total de vendas à prazo: " + somaPrazo);
    }    
}
