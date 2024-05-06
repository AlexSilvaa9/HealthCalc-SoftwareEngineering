package healthcalc;

/**
 * Calculator of some health parameters of persons.
 * 
 * @author ISA
 *
 */
public interface HealthHospital {
	
	/**
	 * Calculate the ideal weight (IW) of a person following the Lorentz formula:
	 * For men: IW = height - 100 - (height - 150) / 4)
	 * For women: IW = height - 100 - (height - 150) / 2.5)
	 *
	 * @param height 	Height of the person (m).
	 * @param gender	Gender of the person ('m' or 'w').
	 * @return 		 	The ideal weight of the person (g).
	 * @throws Exception 
	 */
	public float pesoIdeal(float altura, char genero) throws Exception;
	
	/**
	 * Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:
	 * For men: BMR = 10 * weight + 6.25 * height - 5 * age + 5
	 * For women: BMR = 10 * weight + 6.25 * height - 5 * age - 161
	 *   
	 * @param weight	Weight of the person (g).
	 * @param height 	Height of the person (m).
	 * @param gender	Gender of the person ('m' or 'w').
	 * @param age		Age of the person.
	 * @return	  		The Basal Metabolic Rate of the person.
	 * @throws Exception
	 */
	public float bmr(int peso, float altura, char genero, int edad) throws Exception;
}
