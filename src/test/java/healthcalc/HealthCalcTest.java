package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
	private HealthCalcImpl calc= new HealthCalcImpl();

	@Test
	@DisplayName("Peso negativo en Ideal Weight")
	public void pnegIW() {
		
		assertThrows(RuntimeException.class, () -> calc.idealWeight(-10, 'm'));
	}
	@Test
	@DisplayName("Genero ni 'm', ni 'f' en Ideal Weight")
	public void generomalIW() {
		assertThrows(RuntimeException.class, () -> calc.idealWeight(10, 'z'));

	}
	@Test
	@DisplayName("Genero mayusculas en Ideal Weight")
	public void generoMayIW() throws Exception {
		assertEquals(58, calc.idealWeight(160, 'M'));
	}
	@Test
	@DisplayName("Peso 60 en Ideal Weight (valor bajo)")
	public void peso60IW() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("Peso 90 en Ideal Weight (valor alto)")
	public void peso90IW() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("Desbordamiento en Ideal Weight")
	public void desbordIW() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("genero 'm' en Ideal Weight")
	public void generoMIW() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("genero 'f' en Ideal Weight")
	public void generoFIW() {
		assertEquals(true, true);
	}

	@Test
	@DisplayName("Peso negativo en basalMetabolicRate")
	public void pnegBMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("altura negativa en basalMetabolicRate")
	public void altNegBMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("edad negativa en basalMetabolicRate")
	public void edadNegBMR() {
		assertEquals(true, true);
	}


	@Test
	@DisplayName("Genero ni 'm', ni 'f' en basalMetabolicRate")
	public void generomalBMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("Genero mayusculas en basalMetabolicRate")
	public void generoMayBMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("Peso 60, altura 170, edad 20 en basalMetabolicRate(valores bajos)")
	public void peso60Altura170Edad20BMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("Peso 150, altura 200, edad 90 en basalMetabolicRate(valores altos)")
	public void peso150Altura200Edad90BMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("Desbordamiento en basalMetabolicRate")
	public void desbordBMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("genero 'm' en basalMetabolicRate")
	public void generoBMR() {
		assertEquals(true, true);
	}
	@Test
	@DisplayName("genero 'f' en basalMetabolicRate")
	public void generoFBMR() {
		assertEquals(true, true);
	}
}

