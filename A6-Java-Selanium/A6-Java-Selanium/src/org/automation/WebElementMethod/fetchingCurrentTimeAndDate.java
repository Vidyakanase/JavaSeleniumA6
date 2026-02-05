package org.automation.WebElementMethod;

import java.time.LocalDateTime;

public class fetchingCurrentTimeAndDate {


	public static void main(String[] args) {
		
		LocalDateTime Idt = LocalDateTime.now();
		String timestamp = Idt.toString().replace(':','-');
		System.out.println(timestamp);
	}

}
