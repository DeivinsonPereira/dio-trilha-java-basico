package web.digitalinnovationone.basico;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void test() {
		Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0 ));
		assertEquals(23, jessica.getIdade());
	}

	@Test
	void deveRetornarSeEhMaiorDeIdade() {
		Pessoa pessoa = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0 ));
		Assertions.assertTrue(pessoa.ehMaiorDeIdade());
		
		Pessoa joao = new Pessoa("João", LocalDateTime.now());
		Assertions.assertFalse(joao.ehMaiorDeIdade());
	}
}
