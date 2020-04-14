import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Nomina.modelo.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Nomina nomina = new Nomina ("1","1212","Arturito","2020-04-15","2020-04-15","2020-04-15");	
		NominaDAO n = new NominaDAO();
		
		n.registrar(nomina);
		
		
		System.out.println( n.buscar(nomina));
		
		

	}

}
