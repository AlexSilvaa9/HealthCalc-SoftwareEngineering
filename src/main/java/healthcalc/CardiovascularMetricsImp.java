package healthcalc;

public class CardiovascularMetricsImp implements CardiovascularMetrics{

    public double getIdealWeight(Person person) throws Exception{
        //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
            if(person.height()<=0){
                throw new RuntimeException("altura menor o igual que cero");
            }
            double IW;
            if(!(person.gender().equals(Gender.MALE) || person.gender().equals(Gender.FEMALE))){
                throw new RuntimeException("Genero incorrecto");
            }else if(person.gender().equals(Gender.MALE)){
                IW = person.height() - 100 - (person.height() - 150) / 4;
            }else{
                IW = (person.height() - 100 - (person.height() - 150) / 2.5);
            }
            
            return  IW;
}

  
}