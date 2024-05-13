package healthcalc;

public class CardiovascularMetricsImp implements CardiovascularMetrics{

    public float getIdealWeight(int height, char gender) throws Exception{
        //  * Calculate the ideal weight (IW) of a person following the Lorentz formula:
            if(height<=0){
                throw new RuntimeException("altura menor o igual que cero");
            }
            gender=Character.toUpperCase(gender);
            double IW;
            if(!(gender=='M' || gender=='F')){
                throw new RuntimeException("Genero incorrecto");
            }else if(gender=='M'){
                IW = height - 100 - (height - 150) / 4;
            }else{
                IW = (height - 100 - (height - 150) / 2.5);
            }
            
            return (float) IW;
}

  
}