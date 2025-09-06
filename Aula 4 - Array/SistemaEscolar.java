import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    BufferedReader reader;
    Escola e1;
    public static void main(String[] args) throws  Exception{
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nome da escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("Telefone: ");
        se.e1.setFone(se.reader.readLine());
        
        se.menu();
    }
    
    private void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")) { 
            System.out.println("-------------------------------");
            System.out.println("[1] Cadastrar nova turma.");
            System.out.println("[2] Listar turmas existentes.");
            System.out.println("[3] Consultar uma turma.");
            System.out.println("[4] Sair.");
            opcao = this.reader.readLine();

            switch(opcao){
                case "1":
                    CadastrarTurma();
                    break;

                case "2":
                    //chamar o método que lista uma turma
                    break;

                case "3":
                    //chamar o método que consulta uma turma
                    break;
                
                default:
                    break;
            }
        }
    }

    private void CadastrarTurma() throws Exception{
        Turma t = new Turma();

        System.out.println("CADASTRO DE TURMAS");
        //cadastro turmas: 
        System.out.println("Número da turma:");
        // String num = reader.readLine();
        // int numInteiro = Integer.parseInt(num);
        // t.setNumTurma(numInteiro);
        // ou:
        t.setNumTurma(Integer.parseInt(reader.readLine()));

        System.out.println("Nome do curso:");
        t.setNomeCurso(reader.readLine());

        System.out.println("Ano de ingresso:");
        t.setAnoIngresso(Integer.parseInt(reader.readLine()));

        //cadastro alunos:
        System.out.println("---Alunos---");
        for(int i=0; i<40; i++){
            System.out.println("Nome do aluno:");
            String nome = reader.readLine();
            if(nome.equals("")) {
                break;
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Matrícula:");
            aluno.setMatricula(reader.readLine());
            //notas:
            // nota 1
            System.out.println("Nota 1:");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            // nota 2
            System.out.println("Nota 2:");
            aluno.setNota2(Float.parseFloat(reader.readLine()));
            // nota 3
            System.out.println("Nota 3:");
            aluno.setNota3(Float.parseFloat(reader.readLine()));
            //nota 4
            System.out.println("Nota 4:");
            aluno.setNota4(Float.parseFloat(reader.readLine()));

            //guardar os dados para não perdê-los
            t.setAluno(aluno);
        }
        e1.setTurmas(t);
    }
}
