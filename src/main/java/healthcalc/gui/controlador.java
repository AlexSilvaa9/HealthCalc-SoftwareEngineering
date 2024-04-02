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
		
	}

}