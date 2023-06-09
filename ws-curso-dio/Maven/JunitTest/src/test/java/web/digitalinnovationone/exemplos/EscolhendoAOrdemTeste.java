package web.digitalinnovationone.exemplos;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) **Ordem registrada acimar de cada teste com @Order(número ref);
//@TestMethodOrder(MethodOrderer.MethodName.class) ** respeita ordem alfabética de cada método teste
//@TestMethodOrder(MethodOrderer.Random.class) ** escolhe de forma randomica os testes.
@TestMethodOrder(MethodOrderer.DisplayName.class) // o que vale é o display name
class EscolhendoAOrdemTeste {

	@DisplayName("A")
	@Test
	void validaFluxoA() {
		assertTrue(true);
	}
	
	@DisplayName("B")
	@Test
	void validaFluxoB() {
		assertTrue(true);
	}
	
	@DisplayName("C")
	@Test
	void validaFluxoC() {
		assertTrue(true);
	}
	
	@DisplayName("D")
	@Test
	void validaFluxoD() {
		assertTrue(true);
	}

}
