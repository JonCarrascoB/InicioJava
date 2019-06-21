import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.formacion.basico.Person;

public class FicheroEjemplo {

	public static void main(String[] args) throws IOException {

		String ficheroNombrePersonas = "C:\\1713\\eclipse-workspace\\1713\\personas.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroNombrePersonas));
		oos.writeObject(new Person("MAnolito"));
		oos.flush();

		// TODO leer objketo del fichero
		// @see http://www.chuidiang.org/java/ficheros/ObjetosFichero.php

		String lineaSimulada = "1;Manolo;12;verdes;mucho";

		String[] campos = lineaSimulada.split(";");

		System.out.println("Fichero guardado");

		System.out.println("Ejercicios Fichero");

		String ficheroNombre = "C:\\1713\\eclipse-workspace\\InicioJava\\InicioJava\\ejemplo.txt";

		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter(ficheroNombre);
				BufferedWriter bw = new BufferedWriter(fw);
				BufferedReader br = new BufferedReader(new FileReader(ficheroNombre));) {

			System.out.println("Escribe algo");
			String linea1 = sc.nextLine();
			System.out.println("Escribe otra cosa");
			String linea2 = sc.nextLine();

			bw.write(linea1);
			bw.newLine();
			bw.write(linea2);
			// TODO mirar para no resetear
			bw.close();

			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			System.out.println("Terminamos de leer");

		}
	}
}
