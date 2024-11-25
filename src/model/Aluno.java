package model;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String cpf, String nome, LocalDate nascimento, int matricula, String curso) {
        super(cpf, nome, nascimento);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
