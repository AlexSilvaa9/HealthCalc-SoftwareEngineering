package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.*;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl modelo = new HealthCalcImpl();
					vista vista = new vista();
					controlador controlador = new controlador(modelo, vista);
					vista.registrarControlador(controlador);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}