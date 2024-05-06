package healthcalc;

public class Proxy implements HealthCalc{
    private HealthCalcImpl calculadoraReal;
    private HealthStats estadisticas;
    public Proxy(){
        calculadoraReal = HealthCalcImpl.getInstance();
        estadisticas = new HealthStatsImp();
    }
    @Override
    public float idealWeight(int height, char gender) throws Exception {
        estadisticas.altura
        return calculadoraReal.idealWeight(height,gender);
    }
    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        return calculadoraReal.basalMetabolicRate(weight, height,gender,age);
    }
}
