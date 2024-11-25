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
        float salario = 0;
        switch (formacao){
            case Formacao.ESPECIALIZACAO ->
                salario = super.getSalario()+500;
            case Formacao.MESTRADO ->
                salario = super.getSalario()+1000;
            case Formacao.DOUTORADO ->
                salario = super.getSalario()+2000;
            default -> salario = super.getSalario();
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
