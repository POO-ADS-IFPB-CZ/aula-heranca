package view;

import model.Formacao;
import model.Professor;
import model.TecnicoAdministrativo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("111.111.111-01",
                "João", LocalDate.now(),
                3000, Formacao.DOUTORADO);
        TecnicoAdministrativo tecnicoAdministrativo = new
                TecnicoAdministrativo("222.222.222-02",
                "Maria", LocalDate.now(),
                3000, "Biblioteca");

        System.out.println(professor.getSalario());
        System.out.println(tecnicoAdministrativo.getSalario());

    }
}