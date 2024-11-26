package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    protected float salario;

    public Funcionario(String cpf, String nome,
               LocalDate nascimento, float salario){
        super(cpf, nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
