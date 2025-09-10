public class Turma {
    private int numTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdAlunos;
    private Aluno[] vetAlunos;

    public Turma(){
        this.vetAlunos = new Aluno[40];
    }

    public int getNumTurma() {
        return numTurma;
    }
    public void setNumTurma(int numTurma) {
        this.numTurma = numTurma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public Aluno getAluno(int pos) {
        return vetAlunos[pos];
    }
    public void setAluno(Aluno a) {
        if(this.qtdAlunos < 40){            
            this.vetAlunos[qtdAlunos] = a;
            qtdAlunos++;
        }
    }
}
