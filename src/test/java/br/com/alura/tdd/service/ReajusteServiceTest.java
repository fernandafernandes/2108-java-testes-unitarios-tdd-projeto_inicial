package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void reajusteDezPorCentorQuandoADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Zuleide", LocalDate.now(), new BigDecimal("1000"));
    }
}
