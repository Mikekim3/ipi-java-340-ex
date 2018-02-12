package com.ipiecoles.java.java340.model;



import org.assertj.core.api.Assertions;
import org.junit.Test;


public class CommercialTest {
	@Test
	//Les test sont tjs en class void
	public void testGetPrimeAnnuelleWithCANull(){
		//Given
		Commercial commercial = new Commercial();
		commercial.setCaAnnuel(null);
		
		//When
		Double prime = commercial.getPrimeAnnuelle();
		
		//Then
		Assertions.assertThat(prime).isEqualTo(500d);
	}
}
