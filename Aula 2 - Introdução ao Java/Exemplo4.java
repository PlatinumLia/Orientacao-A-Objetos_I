public class Exemplo4{
	public static void main(String[] args){
		OperacoesMatematicas opMat = new OperacoesMatematicas();
		System.out.println("5 - 6 = " + opMat.subtrair(5, 6));
		System.out.println("5 / 0 = " + opMat.dividir(5, 0));
	}
}
