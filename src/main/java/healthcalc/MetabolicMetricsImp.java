package healthcalc;

public class MetabolicMetricsImp implements MetabolicMetrics{

    public double basalMetabolicRate(float weight, int height, Gender gender, int age) throws Exception{
        // Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:

        if(weight <= 0){
            throw new RuntimeException("peso menor o igual que cero");
        }
        if(height <=0){
            throw new RuntimeException("altura menor o igual que cero");
        }
        if(age <= 0){
            throw new RuntimeException("edad menor o igual que cero");
        }
        if(!(gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE))){
            throw new RuntimeException("Genero incorrecto");
        }
        double BMR;
        if(gender.equals(Gender.MALE)){
            BMR = 10 * weight + 6.25 * height - 5 * age + 5;
        }else{
            BMR = 10 * weight + 6.25 * height - 5 * age - 161;
        }
        // cuando se desborda pasa a ser infinito
        if(Double.isInfinite(BMR)){
            throw new ArithmeticException("Se ha desbordado");
        }
        return BMR;
    
	 
    }
}
