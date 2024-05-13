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
        // Calcular según el método seleccionado
        String method = vista.getMethod();
        char gender = vista.getGender();
        int height = vista.getHeight();

        if (method.equals("Ideal Weight")) {
            if (height == 0 || gender == '\0') {
                vista.error("Por favor, complete todos los campos.");
            } else {
                try {
                    double resultado = modelo.idealWeight(height, gender);
                    vista.setResultado(String.valueOf(resultado));
                } catch (Exception error) {
                    vista.error("Error en el cálculo del peso ideal.");
                }
            }
        } else if (method.equals("Basal Metabolic Rate")) {
            int age = vista.getAge();
            float weight = vista.getWeight();

            if (height == 0 || gender == '\0' || age == 0 || weight == 0.0) {
                vista.error("Por favor, complete todos los campos.");
            } else {
                try {
                    double resultado = modelo.basalMetabolicRate(weight, height, gender, age);
                    vista.setResultado(String.valueOf(resultado));
                } catch (Exception error) {
                    vista.error("Error en el cálculo de la tasa metabólica basal.");
                }
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