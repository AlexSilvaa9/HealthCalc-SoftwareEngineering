package healthcalc;

public class DecoradorIngles extends BaseDecorator{
    private String unidadAltura;
    private String unidadPeso;
    public DecoradorIngles(HealthHospital componente) {
        super(componente);
        if(componente.getClass().getName().equals("healthcalc.DecoradorAmericano")){
            unidadPeso = "pounds";
            unidadAltura = "feet";
        }else if(componente.getClass().getName().equals("healthcalc.DecoradorEuropeo")){
            unidadPeso = "kilograms";
            unidadAltura = "meters";
        }
    }
    public float pesoIdeal(float altura, char genero) throws Exception {
        float peso = super.pesoIdeal(altura, genero);
        System.out.println("The ideal weight for a height of " + altura + " " + unidadAltura + " is " + peso + " " + unidadPeso);        
        return peso;
    }
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        float bmr = super.bmr(peso, altura, genero, edad);
        System.out.println("The BMR for a person of " + altura + " " + unidadAltura + " and " + peso + " " + unidadPeso + " is " + bmr + " calories");        
        return bmr;
    }
}
