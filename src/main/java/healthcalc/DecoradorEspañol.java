package healthcalc;

public class DecoradorEspañol extends BaseDecorator{
    private String unidadAltura;
    private String unidadPeso;
    public DecoradorEspañol(HealthHospital componente) {
        super(componente);
        System.out.println(componente.getClass().getName());
        if(componente.getClass().getName().equals("healthcalc.DecoradorAmericano")){
            unidadPeso = "libras";
            unidadAltura = "pies";
        }else if(componente.getClass().getName().equals("healthcalc.DecoradorEuropeo")){
            unidadPeso = "kilogramos";
            unidadAltura = "metros";
        }
    }
    public float pesoIdeal(float altura, char genero) throws Exception {
        float peso = super.pesoIdeal(altura, genero);
        System.out.println("El peso ideal para una altura de " + altura + " " + unidadAltura + " es de " + peso + " " + unidadPeso);
        
        return peso;
    }
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        float bmr = super.bmr(peso, altura, genero, edad);
        System.out.println("El BMR para una persona de " + altura + " " + unidadAltura + " y " + peso + " " + unidadPeso + " es de " + bmr + " calorias");
        return bmr;
    }
}
