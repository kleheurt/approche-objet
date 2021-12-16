package fr.diginamic.dates;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		Date d2 = new Date(2016-1900,5-1,19,23,59,30);
		System.out.println((d2.getYear()+1900)+"/"
							+(d2.getMonth()+1)+"/"
							+d2.getDate()+" "
							+d2.getHours()+":"
							+d2.getMinutes()+":"
							+d2.getSeconds());

	}

}
