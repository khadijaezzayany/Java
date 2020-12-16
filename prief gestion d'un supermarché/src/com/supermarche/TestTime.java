package com.supermarche;

//import java.sql.Date;

//import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestTime {

	public static void main(String[] args) {
	/*Date cuurentDatrFormat = new Date();
	System.out.println(cuurentDatrFormat);
	*/
	SimpleDateFormat timeCuurentDate = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");
	Date time= new Date();
	System.out.println(timeCuurentDate.format(time));
	}
	

}
