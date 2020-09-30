package co.edu.unbosque.model.persistence;

import java.io.*;

public class TrabajoFile {

	private String archivo = "./data/datosprincipales.csv";
	private String n1 = "./data/Nomina1.txt";
	private String n2 = "./data/Nomina2.txt";
	private String n3 = "./data/Nomina3.txt";
	private String[] documento;
	private String[] nombre;
	private double[] salario;

	public String LeerDatos() {

		String linea = "";

		File f1 = new File(this.archivo);

		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			int i = 0;
			while (linea != null) {
				String[] data = linea.split(";");
				documento[i] = data[0].trim();
				nombre[i] = data[1].trim();
				salario[i] = Double.parseDouble(data[2].trim());
				i++;
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			return "" + e;
		}

		return "";
	}

	public int EscribirArchivos(String d1, String d2, String d3) {
		File n1 = new File(this.n1);
		File n2 = new File(this.n2);
		File n3 = new File(this.n3);
		try {
			FileWriter fw1 = new FileWriter(n1);
			PrintWriter pw1 = new PrintWriter(fw1);
			pw1.println(d1);
			fw1.close();

			FileWriter fw2 = new FileWriter(n2);
			PrintWriter pw2 = new PrintWriter(fw2);
			pw2.println(d2);
			fw2.close();

			FileWriter fw3 = new FileWriter(n3);
			PrintWriter pw3 = new PrintWriter(fw3);
			pw3.println(d3);
			fw3.close();

		} catch (IOException e) {
			return 0;
		}
		return 1;
	}

	public String[] getDocumento() {
		return documento;
	}

	public void setDocumento(String[] documento) {
		this.documento = documento;
	}

	public String[] getNombre() {
		return nombre;
	}

	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}

	public double[] getSalario() {
		return salario;
	}

	public void setSalario(double[] salario) {
		this.salario = salario;
	}

}
