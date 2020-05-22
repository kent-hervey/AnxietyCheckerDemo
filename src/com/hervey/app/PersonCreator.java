package com.hervey.app;

import java.util.Set;

public class PersonCreator {
	
	private static boolean hasCOVID19;
	private static boolean hasEnemies;
	private static boolean isFrail;
	private static boolean belivesInChemtrails;
	
	public static Person createPerson() {
		
		hasCOVID19 =  true;
		hasEnemies = false;
		isFrail = true;
		belivesInChemtrails = false;
		
		
		
		
		Person person = new Person(hasCOVID19, hasEnemies, isFrail, belivesInChemtrails);
		
		return person;
	}
	

}
