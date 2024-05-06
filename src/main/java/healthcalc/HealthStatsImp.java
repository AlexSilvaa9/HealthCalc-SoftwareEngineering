package healthcalc;

import java.util.ArrayList;

public class HealthStatsImp implements HealthStats{

    public ArrayList<Float> pesos;
    public ArrayList<Float> alturas;
    public ArrayList<Integer> edades;
    public ArrayList<Float> bmrs;
    public int numPacientes;
    public int numSexoH;
    public int numSexoM;

    public HealthStatsImp(){
        pesos = new ArrayList<Float>();
        alturas = new ArrayList<Float>();
        edades = new ArrayList<Integer>();
        bmrs = new ArrayList<Float>();
        numPacientes = 0;
        numSexoH = 0;
        numSexoM = 0;
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
    public void añadeSexo(char sexo){
        if(sexo == 'm'){
            numSexoM++;
        }else{
            numSexoH++;
        }
    }
    public void añadePaciente(){
        numPacientes++;
    }
    
}
