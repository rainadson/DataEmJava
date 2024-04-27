package modulo_datas;

import java.util.Date;

public class DatasEmJava {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("data em milisegundos:  " + date.getTime());
		
		System.out.println("dia do mes:  " + date.getDate());
		
		System.out.println("dia da semana:  " + date.getDay());
	}

}
