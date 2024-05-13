package healthcalc;

public class MetabolicMetricsImp implements MetabolicMetrics{

    public double basalMetabolicRate(Person person) throws Exception{
        // Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:

        if(person.weight() <= 0){
            throw new RuntimeException("peso menor o igual que cero");
        }
        if(person.height() <=0){
            throw new RuntimeException("altura menor o igual que cero");
        }
        if(person.age() <= 0){
            throw new RuntimeException("edad menor o igual que cero");
        }
        if(!(person.gender().equals(Gender.MALE) || person.gender().equals(Gender.FEMALE))){
            throw new RuntimeException("Genero incorrecto");
        }
        double BMR;
        if(person.gender().equals(Gender.MALE)){
            BMR = 10 * person.weight() + 6.25 * person.height() - 5 * person.age() + 5;
        }else{
            BMR = 10 * person.weight() + 6.25 * person.height() - 5 * person.age() - 161;
        }
        // cuando se desborda pasa a ser infinito
        if(Double.isInfinite(BMR)){
            throw new ArithmeticException("Se ha desbordado");
        }
        return BMR;
    
	 
    }
}
