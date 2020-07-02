package cursoAutoWebTurma2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculoMediaTest {
	
	@Test
	public void validaReprovacao() {
		
		CalculoMedia cm = new CalculoMedia(4, 4);
		
		assertEquals("Reprovado",cm.getSituacao());
				
	}
	
	@Test
	public void validaAprovacao() {
		
		CalculoMedia cm = new CalculoMedia();
		cm.setNota1(10);
		cm.setNota2(10);
		
		assertEquals("Aprovado",cm.getSituacao());
				
	}
	
	//@Test
	/*public void testeComErro() throws Exception {
		throw new Exception("Erro!");
	}*/
	
	@Test
	public void buscaNota1() {
		
		CalculoMedia cm = new CalculoMedia();
		cm.setNota1(10);
		cm.setNota2(10);
		
		assertEquals(10,cm.getNota1());
				
	}
	
	@Test
	public void buscaNota2() {
		
		CalculoMedia cm = new CalculoMedia();
		cm.setNota1(10);
		cm.setNota2(11);
		
		assertEquals(11,cm.getNota2());
				
	}
	

}
