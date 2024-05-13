package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
	private HealthCalcImpl calc= HealthCalcImpl.getInstance();

	@Test
	@DisplayName("Altura negativa en Ideal Weight")
	public void alturaNegIW() {
		
		assertThrows(RuntimeException.class, () -> calc.idealWeight(new PersonImp(-10, Gender.MALE)));
	}
	@Test
	@DisplayName("Altura cero en Ideal Weight")
	public void alturaCeroIW() {
		
		assertThrows(RuntimeException.class, () -> calc.idealWeight(new PersonImp(0, Gender.MALE)));
	}
	@Test
	@DisplayName("Genero ni 'm', ni 'f' en Ideal Weight")
	public void generomalIW() {
		assertThrows(RuntimeException.class, () -> calc.idealWeight(new PersonImp(10, null)));

	}
	
	@Test
	@DisplayName("Altura 160 en Ideal Weight (valor bajo)")
	public void altura160IW() throws Exception {
		assertEquals(57.5, calc.idealWeight(new PersonImp(160, Gender.MALE)));
	}
	@Test
	@DisplayName("Altura 190 en Ideal Weight (valor alto)")
	public void altura190IW() throws Exception{
		assertEquals(80, calc.idealWeight(new PersonImp(190, Gender.MALE)));
	}
	@Test
	@DisplayName("genero 'm' en Ideal Weight")
	public void generoMIW() throws Exception{
		assertEquals(80, calc.idealWeight(new PersonImp(190, Gender.MALE)));
	}
	@Test
	@DisplayName("genero 'f' en Ideal Weight")
	public void generoFIW() throws Exception{
		assertEquals(74, calc.idealWeight(new PersonImp(190, Gender.FEMALE)));

	}

	@Test
	@DisplayName("Peso negativo en basalMetabolicRate")
	public void pnegBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(-60, 170, Gender.MALE, 20)));
	}
	@Test
	@DisplayName("Peso cero en basalMetabolicRate")
	public void pCeroBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(0, 170, Gender.MALE, 20)));
	}
	@Test
	@DisplayName("altura negativa en basalMetabolicRate")
	public void altNegBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(60, -170, Gender.MALE, 20)));

	}
	@Test
	@DisplayName("altura cero en basalMetabolicRate")
	public void altCeroBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(60, 0, Gender.MALE, 20)));

	}
	@Test
	@DisplayName("edad negativa en basalMetabolicRate")
	public void edadNegBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(60, 170, Gender.MALE, -20)));
	}
	@Test
	@DisplayName("edad cero en basalMetabolicRate")
	public void edadCeroBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(60, 170, Gender.MALE, 0)));
	}
	@Test
	@DisplayName("Genero ni 'm', ni 'f' en basalMetabolicRate")
	public void generomalBMR() {
		assertThrows(RuntimeException.class, () -> calc.basalMetabolicRate(new PersonImp(60, 170, null, 20)));

	}
	@Test
	@DisplayName("Genero mayusculas en basalMetabolicRate")
	public void generoMayBMR() throws Exception{
		assertEquals(1567.5, calc.basalMetabolicRate(new PersonImp(60, 170, Gender.MALE, 20)));
	}
	@Test
	@DisplayName("Peso 60, altura 170, edad 20 en basalMetabolicRate(valores bajos)")
	public void peso60Altura170Edad20BMR() throws Exception{
		assertEquals(1567.5, calc.basalMetabolicRate(new PersonImp(60, 170, Gender.MALE, 20)));

	}
	@Test
	@DisplayName("Peso 150, altura 200, edad 90 en basalMetabolicRate(valores altos)")
	public void peso150Altura200Edad90BMR() throws Exception{
		assertEquals(2305.0, calc.basalMetabolicRate(new PersonImp(150, 200, Gender.MALE, 90)));

	}
	@Test
	@DisplayName("Desbordamiento en basalMetabolicRate")
	public void desbordBMR() {
		assertThrows(ArithmeticException.class,() -> calc.basalMetabolicRate(new PersonImp(Float.MAX_VALUE, Integer.MAX_VALUE, Gender.MALE, 10)));
	}
	@Test
	@DisplayName("genero 'm' en basalMetabolicRate")
	public void generoBMR() throws Exception{
		assertEquals(2305.0, calc.basalMetabolicRate(new PersonImp(150, 200, Gender.MALE, 90)));
	}
	@Test
	@DisplayName("genero 'f' en basalMetabolicRate")
	public void generoFBMR() throws Exception{
		assertEquals(2139.0, calc.basalMetabolicRate(new PersonImp(150, 200, Gender.FEMALE, 90)));
	}
}

