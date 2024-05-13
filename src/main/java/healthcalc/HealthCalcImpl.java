package healthcalc;

public class HealthCalcImpl implements HealthCalc {
    private CardiovascularMetrics cardiovascularMetrics=new CardiovascularMetricsImp();
    private MetabolicMetrics metabolicMetrics=new MetabolicMetricsImp();

    private static HealthCalcImpl instance;

    private HealthCalcImpl(){
        super();
    }
    public static HealthCalcImpl getInstance(){
        if (instance==null) {
            instance=new HealthCalcImpl();
            
        }
        return instance;
    }
    public double idealWeight(int height, Gender gender) throws Exception{
    //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
       return cardiovascularMetrics.getIdealWeight(height,gender);
	 
    }
    public double basalMetabolicRate(float weight, int height, Gender gender, int age) throws Exception{
        // Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:
        return metabolicMetrics.basalMetabolicRate(weight, height, gender, age);
    
	 
    }
	
}
