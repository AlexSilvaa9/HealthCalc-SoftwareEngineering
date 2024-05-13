package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.*;

public class main {

	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl modelo = HealthCalcImpl.getInstance();
					// HealthHospital modelo = new adapter();
					vista vista = new vista();
					controlador controlador = new controlador(modelo, vista);
					vista.registrarControlador(controlador);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	
		//probar proxy y adapter

		// HealthHospital modelo = new adapter();
		// System.out.println(modelo.pesoIdeal((float) 1.8, 'm'));
		// System.out.println(modelo.pesoIdeal((float) 1.4, 'm'));
		// System.out.println(modelo.pesoIdeal((float) 1.1, 'm'));
		// HealthStats estadisticas=HealthStatsImp.getInstance();
		// System.out.println(estadisticas.alturaMedia());

		// //probar decorador
		// HealthHospital modelo = new adapter();
		// HealthHospital modeloAmericano = new DecoradorAmericano(modelo);
		// HealthHospital modeloEuropeo = new DecoradorEuropeo(modelo);
		
		// System.out.println(modeloAmericano.pesoIdeal((float) 1.8, 'm'));
		// System.out.println(modeloEuropeo.pesoIdeal((float) 1.8, 'm'));

		// HealthHospital modeloAmericanoEspanol = new DecoradorEspañol(modeloAmericano);
		// System.out.println(modeloAmericanoEspanol.pesoIdeal((float) 1.8, 'm'));

		// HealthHospital modeloAmericanoIngles = new DecoradorIngles(modeloAmericano);
		// System.out.println(modeloAmericanoIngles.pesoIdeal((float) 1.8, 'm'));

		// HealthHospital modeloEuropeoEspanol = new DecoradorEspañol(modeloEuropeo);
		// System.out.println(modeloEuropeoEspanol.pesoIdeal((float) 1.8, 'm'));

		// HealthHospital modeloEuropeoIngles = new DecoradorIngles(modeloEuropeo);
		// System.out.println(modeloEuropeoIngles.pesoIdeal((float) 1.8, 'm'));

		

	}
}