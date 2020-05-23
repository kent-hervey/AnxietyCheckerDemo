package com.hervey.app;

import java.util.Random;

public class PersonCreator {

	private static boolean hasCOVID19 = true;
	private static boolean hasEnemies = true;
	private static boolean isFrail = true;
	private static boolean belivesInChemtrails = true;

	public static Person createPerson() {
		
		setStaticParametersRandomly();
		Person person = createPersonSetVariables();

		return person;
	}

	private static Person createPersonSetVariables() {
		Person person = new Person();
		person.setCovid19Status(hasCOVID19);
		person.setHasEnemies(hasEnemies);
		person.setFrail(isFrail);
		person.setBelievesInChemtrails(belivesInChemtrails);
		person.isAnxiou();
		return person;
	}

	private static void setStaticParametersRandomly() {
		Random randomNum = new Random();	
		hasCOVID19 = randomNum.nextInt(2)==1 ? true : false;
		hasEnemies = randomNum.nextInt(2)==1 ? true : false;
		isFrail = randomNum.nextInt(2)==1 ? true : false;
		belivesInChemtrails = randomNum.nextInt(2)==1 ? true : false;
	}


}
