package co.edu.unbosque.controller;

import co.edu.unbosque.model.NominaFile;
import co.edu.unbosque.view.View;

public class Controller {

	private View v;
	private NominaFile nf;

	public Controller() {
		nf = new NominaFile();
		v = new View();

		v.mostrarMensaje(nf.ImprimirDatos());
		v.mostrarMensaje(nf.GenerarNomina());

	}

}
