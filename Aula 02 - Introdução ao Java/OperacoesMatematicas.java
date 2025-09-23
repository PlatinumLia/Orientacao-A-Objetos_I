public class OperacoesMatematicas{
	public int somar(int num1, int num2){
			return num1 + num2;
	}
	
	public int subtrair(int num1, int num2){
		return num1 - num2;
	}
	
	public int multiplicar(int num1, int num2){
		return num1 * num2;
	}
	
	public int dividir(int num1, int num2){
		if(0 == num2){
			//System.out.println("Impossível divdir por 0!!!!");
			return 0;
		}else{
			return num1 / num2;
		}
	}
}
