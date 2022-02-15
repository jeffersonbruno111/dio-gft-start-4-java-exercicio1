package app;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mensagem {

	private int timeStamp = Integer.parseInt(new SimpleDateFormat("HH").format(Calendar.getInstance().getTime()));
	
	public String mensagem() {
		if(timeStamp < 12) {
			return "Bom dia!";
		}else if(timeStamp > 12 && timeStamp < 18) {
			return "Boa tarde!";
		}else {
			return "Boa noite!";
		}
	}
}
