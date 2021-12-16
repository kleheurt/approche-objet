package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		
		c.set(2016,4,19,34,59,30);
		System.out.println(f.format(c.getTime()));
		
		Calendar c2 = Calendar.getInstance();
		SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(f2.format(c2.getTime()));
		
		SimpleDateFormat fFR = new SimpleDateFormat("EEEE MMMM", Locale.FRANCE);
		SimpleDateFormat fRU = new SimpleDateFormat("EEEE MMMM", new Locale("ru"));
		SimpleDateFormat fCN = new SimpleDateFormat("EEEE MMMM", Locale.CHINESE);
		SimpleDateFormat fDE = new SimpleDateFormat("EEEE MMMM", Locale.GERMAN);

		System.out.println(fFR.format(c2.getTime()));
		System.out.println(fRU.format(c2.getTime()));

		System.out.println(fCN.format(c2.getTime()));
		System.out.println(fDE.format(c2.getTime()));


	}

}
