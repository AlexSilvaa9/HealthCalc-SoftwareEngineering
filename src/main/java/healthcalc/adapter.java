package healthcalc;

public class adapter implements HealthHospital {
    private HealthCalcImpl calculadora;

    public adapter(){
        super();
        calculadora=HealthCalcImpl.getInstance();
        
    }
    @Override
    public float pesoIdeal(int altura, char genero) throws Exception {
        // pasar a metros 
        altura*=100;
        // y pasar a gramos
        return (float) (calculadora.idealWeight(altura, genero)*1000);
    }

    @Override
    public float bmr(float peso, int altura, char genero, int edad) throws Exception {
        // pasar a metros y gramos
        throw new UnsupportedOperationException("Unimplemented method 'bmr'");
        // y pasar otra vez a lo que tenia que ser
    }
    
}
