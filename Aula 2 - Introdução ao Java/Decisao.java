public class Decisao{
	public static void main(String args[]){
		if(args.length < 2){
			System.out.println("Precisa de 2 parâmetros.");
			System.exit(0);
		}
		
		int valor1 = Integer.parseInt(args[0]); //O "Intenger.parseint" converte a String para int
		int valor2 = Integer.parseInt(args[1]);
		OperacoesMatematicas opMat = new OperacoesMatematicas();
		
		System.out.println(args[0] + "*" + args[1] + " = " + opMat.multiplicar(valor1, valor2));
	}
}
