package healthcalc;

public class DecoradorAmericano extends BaseDecorator{

    public DecoradorAmericano(HealthHospital componente) {
        super(componente);
    }
    public float pesoIdeal(float altura, char genero) throws Exception {
        // pasar altura a pies y pesoen libras
        altura = altura * 3.28084f;
        float pesogramos = super.pesoIdeal(altura, genero);
        return pesogramos * 2.20462f;
    }
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        // pasar altura a pies y pesoen libras
        altura = altura * 3.28084f;
        peso = (int) (peso * 2.20462f);
        return super.bmr(peso, altura, genero, edad);
    }
}
