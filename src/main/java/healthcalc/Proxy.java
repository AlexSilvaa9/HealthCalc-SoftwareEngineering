package healthcalc;

public class Proxy implements HealthCalc{
    private HealthCalcImpl calculadoraReal;
    private HealthStatsImp estadisticas;
    public Proxy(){
        calculadoraReal = HealthCalcImpl.getInstance();
        estadisticas = HealthStatsImp.getInstance();
    }
    @Override
    public double idealWeight(Person person) throws Exception {
        estadisticas.añadeAltura(person.height());
        estadisticas.añadeSexo(person.gender());
        estadisticas.añadePaciente();
        return calculadoraReal.idealWeight(person);
    }
    @Override
    public double basalMetabolicRate(Person person) throws Exception {
        estadisticas.añadePeso(person.weight());
        estadisticas.añadeAltura(person.height());
        estadisticas.añadeSexo(person.gender());
        estadisticas.añadeEdad(person.age());
        estadisticas.añadePaciente();

        return calculadoraReal.basalMetabolicRate(person);
    }
}
