package model;

import java.time.LocalDate;

public class Professor extends Funcionario{
    private Formacao formacao;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario, Formacao formacao) {
        super(cpf,nome,nascimento, salario);
        this.formacao = formacao;
    }

    @Override
    public float getSalario(){
        switch (formacao){
            case Formacao.ESPECIALIZACAO ->
                salario += 500;
            case Formacao.MESTRADO ->
                salario += 1000;
            case Formacao.DOUTORADO ->
                salario += 2000;
        }
        return salario;

    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
}
