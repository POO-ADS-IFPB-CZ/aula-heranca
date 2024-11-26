package model;

import java.time.LocalDate;

public class TecnicoAdministrativo extends Funcionario{

    private String setor;

    public TecnicoAdministrativo(String cpf, String nome, LocalDate nascimento, float salario, String setor) {
        super(cpf, nome, nascimento, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public float getSalario(){
        return salario;
    }

}
