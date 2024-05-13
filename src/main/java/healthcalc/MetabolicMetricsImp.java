package healthcalc;

public class MetabolicMetricsImp implements MetabolicMetrics{

    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception{
        // Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:
        gender=Character.toUpperCase(gender);

        if(weight <= 0){
            throw new RuntimeException("peso menor o igual que cero");
        }
        if(height <=0){
            throw new RuntimeException("altura menor o igual que cero");
        }
        if(age <= 0){
            throw new RuntimeException("edad menor o igual que cero");
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