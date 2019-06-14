package com.formacion.utilidades;

public class OrdenarArray {

	// public static final int [] aDes = {1,2,0,4,9,3,8,7,6,5};

	/**
	 * Creamos un bubble Short para ordenar un array por el numero de 0-9
	 * 
	 * @param ARRAY_DESO int [] con numeros desordenados
	 * @return int[] ordenado de menor a mayor
	 * @throws Excepcion si Array_Deso = null
	 */
	public static int[] bubbleShort(int[] aDes) throws Exception {

		if (aDes == null) {
			throw new Exception("No puede ser null");
		}

		int aux = 0;
		for (int i = 0; i < aDes.length; i++) {
			for (int j = 1; j < aDes.length; j++) {
				if (aDes[j - 1] > aDes[j]) {
					aux = aDes[j - 1];
					aDes[j - 1] = aDes[j];
					aDes[j] = aux;
				}

			}
		}
		return aDes;

	};

}
