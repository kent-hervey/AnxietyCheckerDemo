package com.hervey.app;

import java.util.Set;

public class PersonCreator {

	private static boolean hasCOVID19;
	private static boolean hasEnemies;
	private static boolean isFrail;
	private static boolean belivesInChemtrails;

	public static Person createPerson() {

		hasCOVID19 =  true;
		hasEnemies = true;
		isFrail = false;
		belivesInChemtrails = false;

		Person person = new Person();
		person.setCovid19Status(hasCOVID19);
		person.setHasEnemies(hasEnemies);
		person.setFrail(isFrail);
		person.setBelievesInChemtrails(belivesInChemtrails);
		
		person.isAnxiou();

		return person;
	}


}
