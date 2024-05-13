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
    public double idealWeight(Person person) throws Exception{
    //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
       return cardiovascularMetrics.getIdealWeight(person);
	 
    }
    public double basalMetabolicRate(Person person) throws Exception{
        // Calculate the Basal Metabolic Rate (BMR) of a person with the following formula:
        return metabolicMetrics.basalMetabolicRate(person);
    
	 
    }
	
}
