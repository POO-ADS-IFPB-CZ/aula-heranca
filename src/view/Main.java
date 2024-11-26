package view;

import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Aluno("111.111.111-01",
                "João", LocalDate.now(),
                123, "ADS");

    }
}