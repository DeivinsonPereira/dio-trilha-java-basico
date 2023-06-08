package web.digitalinnovationone.exemplos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CondicionaisTeste {

	@Test
	@EnabledIfEnvironmentVariable(named = "User", matches = "Deivinson")
	void validarAlgoSomenteNoUsuarioDeivinson() {
		assertEquals(10, 5 + 5);
	}
	
	@Test
	@DisabledIfEnvironmentVariable (named = "User", matches = "Gabi" )
	void validarAlgoSomenteEmOutroUsuario() {
		assertEquals(10, 5+5);
	}

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void validarAlgoWindows() {
		assertEquals(10, 5+5);
	}
	@Test
	@EnabledOnOs(OS.LINUX)
	void validarAlgoLinux() {
		assertEquals(10, 5+5);
	}
	
	@Test
	@EnabledOnOs({OS.LINUX,  OS.WINDOWS})
	void validarAlgoLinuxEWindows() {
		assertEquals(10, 5+5);
	}
	
	@Test
	@EnabledOnJre(value = { JRE.JAVA_17 })
	void validarAlgoJRE() {
		assertEquals(10, 5+5);
	}
	
	@Test
	@EnabledForJreRange (min = JRE.JAVA_11, max = JRE.JAVA_17)
	void validarAlgoJreRange() {
		assertEquals(10, 5+5);
	}
}
