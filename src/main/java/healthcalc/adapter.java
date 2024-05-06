package healthcalc;

public class adapter implements HealthHospital{
    private HealthCalcImpl adaptado;

    public adapter(){
        super();
        adaptado=HealthCalcImpl.getInstance();
        
    }
    @Override
    public float pesoIdeal(float altura, char genero) throws Exception {
        // pasar a metros 
        // y pasar a gramos
        return  adaptado.idealWeight((int) (altura*100), genero)*1000;
    }

    @Override
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        // pasar a metros y gramos
       
        // y pasar otra vez a lo que tenia que ser
        return adaptado.basalMetabolicRate(altura*100, edad, genero, genero)*1000;
    }
    
}
