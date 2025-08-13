public class Exemplo3{	
	public static void main(String[] args){
		String cliente = "Lia";
		
		Pet pet1 = new Pet(); //instancia um objeto da classe Pet
		pet1.nome = "Amanda";
		pet1.especie = "vira-lata";
		pet1.idade = 18;
		
		System.out.println("A cliente é: " + cliente + " possui um pet chamado " + pet1.nome + " que é " + pet1.especie + " e tem " + pet1.idade + " anos");
		
		Pet pet2 = new Pet();
		pet2.nome = "Kito";
		pet2.especie = "Corvo";
		pet2.idade = 4;
	}
}

