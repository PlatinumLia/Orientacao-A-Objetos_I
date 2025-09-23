import java.io.BufferedReader; //java.io.* : importa tudo da biblioteca
import java.io.InputStreamReader;

public class LerDados{	
	//throws Exeception: forma simples de resolver uma Exception
	public static void main (String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in)
		);
		//BufferedReader: buffer de leitura
		//InputStreamReader: captura um fluxo de entrada de dados
		//System.in: entrada padrão(teclado)
		
		String linha = "";
		System.out.println("Digite algo ou 'S' para sair: ");
		while(!linha.toUpperCase().equals("S")){
			linha = reader.readLine();
			System.out.println("Digitou: " + linha);
		}
	}
}

