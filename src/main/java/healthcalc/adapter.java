package healthcalc;

public class adapter implements HealthHospital{
    private Proxy adaptado;

    public adapter(){
        super();
        adaptado=new Proxy();
        
    }
    @Override
    public float pesoIdeal(float altura, char genero) throws Exception {
        // pasar a metros 
        // y pasar a gramos
        Gender genero_enum=null;
        if (genero == 'm') {
            genero_enum = Gender.MALE;
        } else if (genero == 'f') {
            genero_enum = Gender.FEMALE;
        }
        
        return  (float) (adaptado.idealWeight(new PersonImp((int) (altura*100), genero_enum))*1000);
    }

    @Override
    public float bmr(int peso, float altura, char genero, int edad) throws Exception {
        // pasar a metros y gramos
       
        // y pasar otra vez a lo que tenia que ser
        Gender genero_enum=null;
        if (genero == 'm') {
            genero_enum = Gender.MALE;
        } else if (genero == 'f') {
            genero_enum = Gender.FEMALE;
        }
        
        return (float) (adaptado.basalMetabolicRate(new PersonImp(altura*100, edad, genero_enum, genero))*1000);
    }
    
}
