package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    public float idealWeight(int height, char gender) throws Exception{
    //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
        if(Integer.signum(height)=='-'){
            throw new RuntimeException("altura negativa");
        }
        gender=Character.toUpperCase(gender);
        float IW;
        if(gender!='M' || gender!='F'){
            throw new RuntimeException("Genero incorrecto");
        }else if(gender=='M'){
            IW = height - 100 - (height - 150) / 4;
        }else{
            IW = (float) (height - 100 - (height - 150) / 2.5);
        }
        
	    return IW;
	 
	 
    }
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception{
       
        return 0;
        /**
	 * Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:
	 * For men: BMR = 10 * weight + 6.25 * height - 5 * age + 5
	 * For women: BMR = 10 * weight + 6.25 * height - 5 * age - 161
	 *   
	 * @param weight	Weight of the person (kg).
	 * @param height 	Height of the person (cm).
	 * @param gender	Gender of the person ('m' or 'w').
	 * @param age		Age of the person.
	 * @return	  		The Basal Metabolic Rate of the person.
	 * @throws Exception
	 */
    }
	
}
