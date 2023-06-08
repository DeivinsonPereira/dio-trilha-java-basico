package web.digitalinnovationone.exemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionsTeste {

	@Test
	void validarAlgoSomenteNoUsuarioDeivinson() {
		Assumptions.assumeTrue("Deivinson".equals(System.getenv("USER")));
		assertEquals(10, 5 + 5);
	}

}
