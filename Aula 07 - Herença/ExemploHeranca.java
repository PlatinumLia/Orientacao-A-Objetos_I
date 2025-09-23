public class ExemploHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Lia"); 
        p1.setEmail("mutsuki@gmail.com");
        p1.setIdade(18);
        System.out.println("Nome da pessoa 1: " + p1.getNome());
        
        Pessoa p2 = new Pessoa("Yukko", "yukkon@gmail.com", 19);
        System.out.println("Nome da pessoa 2: " + p2.getNome());

        Aluno a1 = new Aluno();
        a1.setNome("Andye");
        a1.setNota1(88);
        System.out.println("Aluna 1: " + a1.getNome() + " - Nota 1: " + a1.getNota1());
    
        Aluno a2 = new Aluno(86f, 90.5f, 70.7f, 88f, "Giovanna", "gio@gmail.com", 18);
        System.out.println("Aluna 2: " + a2.getNome() + " - Nota 1: " + a2.getNota1());

        
    }    
}