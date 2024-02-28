package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    public float idealWeight(int height, char gender) throws Exception{
    //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
        if(height<0){
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
        gender=Character.toUpperCase(gender);

        if(weight < 0){
            throw new RuntimeException("peso negativo");
        }
        if(height < 0){
            throw new RuntimeException("altura negativa");
        }
        if(age < 0){
            throw new RuntimeException("edad negativa");
        }
        if(!(gender=='M' || gender=='F')){
            throw new RuntimeException("Genero incorrecto");
        }
        double BMR;
        if(gender=='M'){
            BMR = 10 * weight + 6.25 * height - 5 * age + 5;
        }else{
            BMR = 10 * weight + 6.25 * height - 5 * age - 161;
        }
        // cuando se desborda pasa a ser infinito
        float fBMR=(float)BMR;
        if(Float.isInfinite(fBMR)){
            throw new ArithmeticException("Se ha desbordado");
        }
        return fBMR;
    
	 
    }
	
}
