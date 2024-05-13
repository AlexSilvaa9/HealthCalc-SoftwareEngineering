package healthcalc;

public class CardiovascularMetricsImp implements CardiovascularMetrics{

    public double getIdealWeight(int height, Gender gender) throws Exception{
        //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
            if(height<=0){
                throw new RuntimeException("altura menor o igual que cero");
            }
            double IW;
            if(!(gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE))){
                throw new RuntimeException("Genero incorrecto");
            }else if(gender.equals(Gender.MALE)){
                IW = height - 100 - (height - 150) / 4;
            }else{
                IW = (height - 100 - (height - 150) / 2.5);
            }
            
            return  IW;
}

  
}