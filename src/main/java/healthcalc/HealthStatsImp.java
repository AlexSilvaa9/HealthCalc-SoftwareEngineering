package healthcalc;

import java.util.ArrayList;

public class HealthStatsImp implements HealthStats{

    public ArrayList<Float> pesos= new ArrayList<Float>();
    public ArrayList<Float> alturas= new ArrayList<Float>();
    public ArrayList<Integer> edades= new ArrayList<Integer>();
    public ArrayList<Float> bmrs= new ArrayList<Float>();
    public int numPacientes= 0;
    public int numSexoH= 0;
    public int numSexoM= 0;
    private static HealthStatsImp instance;
    
    private HealthStatsImp(){
        super();
    }
    public static HealthStatsImp getInstance(){
        if (instance==null) {
            instance=new HealthStatsImp();
            
        }
        return instance;
    }
    @Override
    public float alturaMedia() {
        float suma = 0;
        for (Float altura : alturas) {
            suma += altura;
        }
        return suma/(numPacientes);
    }

    @Override
    public float pesoMedio() {
        float suma = 0;
        for (Float peso : pesos) {
            suma += peso;
        }
        return suma/(numPacientes);
    }

    @Override
    public float bmrMedio() {
        float suma = 0;
        for (Float bmr : bmrs) {
            suma += bmr;
        }
        return suma/(numPacientes);
    }

    @Override
    public float edadMedio() {
        float suma = 0;
        for (Integer edad : edades) {
            suma += edad;
        }
        return suma/(numPacientes);
    }

    @Override
    public int numSexoH() {
        return numSexoH;
    }

    @Override
    public int numSexoM() {
        return numSexoM;
    }

    @Override
    public int numTotalPacientes() {
        return numPacientes;
    }


    public void añadeAltura(float altura){
        alturas.add(altura);
    }
    public void añadePeso(float peso){
        pesos.add(peso);
    }
    public void añadeEdad(int edad){
        edades.add(edad);
    }
    public void añadeBmr(float bmr){
        bmrs.add(bmr);
    }
    public void añadeSexo(Gender gender){
        if(gender.equals(Gender.MALE)){
            numSexoM++;
        }else{
            numSexoH++;
        }
    }
    public void añadePaciente(){
        numPacientes++;
    }

}
