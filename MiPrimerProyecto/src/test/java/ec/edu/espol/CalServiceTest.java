package ec.edu.espol;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;








public class CalServiceTest {
	
	CalService calService;
	
	@Before //se_ejecuta_antes_de_que_se_ejecuten_las_pruebas
	public void setup(){
		
		ICalculator cal = Mockito.mock (ICalculator.class);      //creando_un_mockito_que_utiliza_la_interfaz_iCalculator
		Mockito.when(cal.add(3, 3)).thenReturn(6);
		calService = new CalService();
		calService.setCal(cal);
		
	}
	
	

	@Test
	public void testAddTwoNumbers(){
		
		Assert.assertEquals(6, calService.AddTwoNumbers(3, 3));
	}

}
