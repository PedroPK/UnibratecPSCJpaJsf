package br.unibratec.testes;

import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

public class TimeZoneTest {
	
	@Test
	public void testarTimeZoneLocal() {
		TimeZone tz = TimeZone.getDefault();
		System.out.println("TimeZone.toString() = " + tz.toString());
		
		System.out.println("TimeZone.getID() = " + tz.getID());
		System.out.println("TimeZone.getDisplayName() = " + tz.getDisplayName());
		/*String[] timeZones = TimeZone.getAvailableIDs();
		for (String timeZone : timeZones) {
			System.out.println(timeZone);
		}*/
		
		Assert.assertNotNull(tz);
	}
	
}
