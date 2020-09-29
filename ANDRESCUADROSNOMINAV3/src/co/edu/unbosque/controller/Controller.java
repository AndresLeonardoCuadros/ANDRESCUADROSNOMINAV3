package co.edu.unbosque.controller;

import co.edu.unbosque.model.NominaFile;
import co.edu.unbosque.view.View;

public class Controller {

	View v;
	NominaFile nf;

	public Controller() {

	}

	public void Mostrar() {
		v.mostrarMensaje(nf.ImprimirDatos());
	}
}
