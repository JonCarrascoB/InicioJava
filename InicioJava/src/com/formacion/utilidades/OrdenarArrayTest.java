package com.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenarArrayTest {
	
	@Test
	public void testBubbleShort () throws Exception {
		
		int [] aDes = {3,2,1};
		int [] aRes = {1,2,3};
		int[] aOrd = OrdenarArray.bubbleShort(aDes);
		assertArrayEquals (aRes, aOrd);
		
		aDes = new int[] {3,3,3};
		aOrd = new int[] {3,3,3};
		aOrd = OrdenarArray.bubbleShort(aDes);
		assertArrayEquals ("toodos iguales", aRes, aOrd);
		
		aDes = new int[] {3,3,1};
		aOrd = new int[] {1,3,3};
		aOrd = OrdenarArray.bubbleShort(aDes);
		assertArrayEquals ("dos iguales y uno diferente", aRes, aOrd);
		
		
	}
	

	@Test (expected = Exception.class)
	public void testBubbleShortNull() throws Exception {
		
		OrdenarArray.bubbleShort(null);
	}

}
