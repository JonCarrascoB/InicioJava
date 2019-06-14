package com.formacion.utilidades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraDevolucion {
	

	public static final float[] BILLETES_MONEDAS = {
			// billetes
			500, 200, 100, 50, 20, 10, 5,
			// monedas
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas optimas para retornar el menor numero de billetes y
	 * monedas
	 * 
	 * @param importe   int costo del articulo a contar
	 * @param entregado float dinero entregado para comprar
	 * @return int[] cantidad de billetes y monedas devuleto
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o si importe <0 o entregado <0
	 */

	public static int[] vueltas(float importe, float entregado) throws Exception {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Calculadora ");

		float dev, aux;
		int resultado[] = new int[BILLETES_MONEDAS.length];
		if (entregado < importe) {
			throw new Exception("Entrega el dinero suficiente para la compra");
		} else {
			if (importe < 0 || entregado <0) {
				throw new Exception("El importe no puede ser negativo");
			} else {

				dev = (float) Math.round((entregado - importe)*100)/100;
				for (int i = 0; i < BILLETES_MONEDAS.length; i++) {

					if (dev >= BILLETES_MONEDAS[i]) {
						if (i < 9) {
							resultado[i] = (int) dev / (int) BILLETES_MONEDAS[i];
							dev = (float) Math.round((dev % BILLETES_MONEDAS[i])*100)/100;
						} else {
							aux = dev / BILLETES_MONEDAS[i];
							resultado[i] = (int) aux;
							dev = (float) Math.round((dev % BILLETES_MONEDAS[i])*100)/100;
						}
					}

				}

			}
		}

		return resultado;
	}

}
