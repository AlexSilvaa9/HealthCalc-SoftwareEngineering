package healthcalc;

public class DecoradorEuropeo extends BaseDecorator{

    public DecoradorEuropeo(HealthHospital componente) {
        super(componente);
    }
    public float pesoIdeal(float altura, char genero) throws Exception {
        return super.pesoIdeal(altura, genero);
    }
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        return super.bmr(peso, altura, genero, edad);
    }
}
