import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploVetor2{	
	//throws Exeception: forma simples de resolver uma Exception
	public static void main (String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in)
		); 
		
		int num = -1;
		Meses meses = new Meses();
		while(num != 0){
			System.out.println("Informe o Nº do mês ou '0' para sair: ");
			num = Integer.parseInt(reader.readLine());
			
			String  mes = meses.pegarNomeMes(num);
			if(!mes.equals("")){
				System.out.println("O mês é: " + mes);
			}else if(num != 0){
				System.out.println("Valor inválido");
			}
		}
	}
}

