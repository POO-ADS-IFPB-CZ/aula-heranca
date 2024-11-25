package model;

import java.time.LocalDate;

public class Professor {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private float salario;
    private String formacao;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario, String formacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
        this.formacao = formacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
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
