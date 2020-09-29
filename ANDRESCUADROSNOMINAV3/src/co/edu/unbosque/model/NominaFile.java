package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.TrabajoFile;

public class NominaFile {

	TrabajoFile tf = new TrabajoFile();

	public String ImprimirDatos() {
		String cadena = "Documento" + " ; " + "     Nombre     " + " ; " + "Salario\n";
		int i = 0;
		while (i <= tf.getDocumento().length) {
			cadena = cadena + tf.getDocumento()[i] + " ; " + tf.getNombre()[i] + " ; " + tf.getSalario()[i] + "\n";
		}

		return cadena;
	}

	public String GenerarNomina() {
		int i = 0;
		String cadena1 = "Nomina1\n" + "Documento" + " -- " + "Salario\n";
		String cadena2 = "Nomina2\n" + "Documento" + " -- " + "Salario\n";
		String cadena3 = "Nomina3\n" + "Documento" + " -- " + "Salario\n";
		while (i <= tf.getDocumento().length) {
			if (tf.getSalario()[i] <= 2000) {
				double s1 = (tf.getSalario()[i] - (tf.getSalario()[i] * 10) / 100);
				cadena1 = cadena1 + tf.getDocumento()[i] + " -- " + s1 + "\n";
				i++;

			} else if (tf.getSalario()[i] > 2000 && tf.getSalario()[i] <= 5000) {
				double s2 = (tf.getSalario()[i] - (tf.getSalario()[i] * 15) / 100);
				cadena2 = cadena2 + tf.getDocumento()[i] + " -- " + s2 + "\n";
				i++;

			} else if (tf.getSalario()[i] > 5000) {
				double s3 = (tf.getSalario()[i] - (tf.getSalario()[i] * 20) / 100);
				cadena3 = cadena3 + tf.getDocumento()[i] + " -- " + s3 + "\n";
				i++;

			}

		}
		tf.EscribirArchivos(cadena1, cadena2, cadena3);
		return "";
	}

}
