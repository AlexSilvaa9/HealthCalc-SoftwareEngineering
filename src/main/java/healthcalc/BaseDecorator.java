package healthcalc;

public class BaseDecorator implements HealthHospital {
    private HealthHospital wrappee;
    BaseDecorator(HealthHospital componente) {
        this.wrappee = componente;
    }
    @Override
    public float pesoIdeal(float altura, char genero) throws Exception {
        return wrappee.pesoIdeal(altura, genero);
    }

    @Override
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        return wrappee.bmr(peso, altura, genero, edad);
    }
    
}
