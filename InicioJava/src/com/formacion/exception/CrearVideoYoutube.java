package com.formacion.exception;

import java.util.Scanner;

import com.formacion.basico.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 200; i++) {
			System.out.println(i);
			if (i == 34) {
				throw new Exception ("");
			}
		}

		Boolean repetir = true;
		Youtube video = null;

		System.out.println("------ Crear Video Youtube -------");
		System.out.println("----------------------------------");
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Titulo del video, recuerda longitud [2, 150]: ");
			String titulo = sc.nextLine();

			System.out.println("Codigo del video, recuerda longitud [11]: ");
			String codigo = sc.nextLine();
			try {
				video = new Youtube(titulo, codigo);
				repetir = false;
			} catch (Exception e) {
				System.out.println("Error " + e.getMessage());
			}
		} while (repetir);
		System.out.println("Video creado correctamente");
		System.out.println(video);
		System.out.println(video.getUrl());

		sc.close();

	}

	

}
