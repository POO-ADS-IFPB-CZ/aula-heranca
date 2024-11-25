package model;

import java.time.LocalDate;

public class Professor extends Pessoa{
    private float salario;
    private String formacao;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario, String formacao) {
        super(cpf,nome,nascimento);
        this.salario = salario;
        this.formacao = formacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
