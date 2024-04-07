package healthcalc.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import healthcalc.HealthCalcImpl;


public class controlador implements ActionListener {
	
	private HealthCalcImpl modelo;
	private vista vista;
	
	public controlador(HealthCalcImpl modelo, vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("Calcular")) {
			// Calcular factorial
			String method=vista.getMethod();
            char gender=vista.getGender();
            int height=vista.getHeight();
            if(method.equals("Ideal Weight")){
                try {
                    float resultado = modelo.idealWeight(height, gender);	
                    vista.setResultado(String.valueOf(resultado));
                } catch (Exception error) {
                    vista.error("error");
                }
            }else if(method.equals("Basal Metabolic Rate")){
                try {
                    int age=vista.getAge();
                    float weight = vista.getWeight();
                    float resultado = modelo.basalMetabolicRate(weight,height,gender,age);	
                    vista.setResultado(String.valueOf(resultado));
                } catch (Exception error) {
                    vista.error("error");
                }
            }
			
			
		} else if (comando.equals("Limpiar")) {
            // Lógica para limpiar los campos
            limpiarCampos();
        }
	}
    // Método para limpiar todos los campos en la vista
    private void limpiarCampos() {
        vista.limpiarCampos();
    }
}