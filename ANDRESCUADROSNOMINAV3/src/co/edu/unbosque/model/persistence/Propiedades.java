package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "./data/archivo.properties";

	public String LeerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);

			linea += "Documento;" + prop.getProperty("Documento") + "\n";
			linea += "Nombre;" + prop.getProperty("Nombre") + "\n";
			linea += "Salario;" + prop.getProperty("Salario") + "\n";
			linea += "Nomina;" + prop.getProperty("Nomina") + "\n";
			linea += "Lista1;" + prop.getProperty("Lista1") + "\n";
			linea += "Lista2;" + prop.getProperty("Lista2") + "\n";
			linea += "Lista3;" + prop.getProperty("Lista3") + "\n";
			
			

		} catch (IOException ex) {
			return null;
		}

		return linea;
	}

}
