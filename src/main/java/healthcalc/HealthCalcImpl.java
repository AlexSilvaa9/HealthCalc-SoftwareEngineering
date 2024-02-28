package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    public float idealWeight(int height, char gender) throws Exception{
    //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
        if(Integer.signum(height)=='-'){
            throw new RuntimeException("altura negativa");
        }
        gender=Character.toUpperCase(gender);
        double IW;
        if(!(gender=='M' || gender=='F')){
            throw new RuntimeException("Genero incorrecto");
        }else if(gender=='M'){
            IW = height - 100 - (height - 150) / 4;
        }else{
            IW = (height - 100 - (height - 150) / 2.5);
        }
        
	    return (float) IW;
	 
	 
    }
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception{
        // Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:
        
        if(Float.toString(weight).valueOf(0).equals("-")){
            throw new RuntimeException("peso negativo");
        }
        if(Integer.signum(height)=='-'){
            throw new RuntimeException("altura negativa");
        }
        if(Integer.signum(age)=='-'){
            throw new RuntimeException("edad negativa");
        }
        if(!(gender=='M' || gender=='F')){
            throw new RuntimeException("Genero incorrecto");
        }
        double BMR;
        gender=Character.toUpperCase(gender);
        if(gender=='M'){
            BMR = 10 * weight + 6.25 * height - 5 * age + 5;
        }else{
            BMR = 10 * weight + 6.25 * height - 5 * age - 161;
        }
        return (float)BMR;
    
	 
    }
	
}
