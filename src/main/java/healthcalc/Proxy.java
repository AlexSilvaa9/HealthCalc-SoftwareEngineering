package healthcalc;

public class Proxy implements HealthCalc{
    private HealthCalcImpl calculadoraReal;
    private HealthStatsImp estadisticas;
    public Proxy(){
        calculadoraReal = HealthCalcImpl.getInstance();
        estadisticas = new HealthStatsImp();
    }
    @Override
    public float idealWeight(int height, char gender) throws Exception {
        estadisticas.añadeAltura(height);
        estadisticas.añadeSexo(gender);
        estadisticas.añadePaciente();
        return calculadoraReal.idealWeight(height,gender);
    }
    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        estadisticas.añadePeso(weight);
        estadisticas.añadeAltura(height);
        estadisticas.añadeSexo(gender);
        estadisticas.añadeEdad(age);
        estadisticas.añadePaciente();

        return calculadoraReal.basalMetabolicRate(weight, height,gender,age);
    }
}
