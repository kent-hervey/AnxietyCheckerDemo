package com.hervey.app;

import java.util.Random;

public class PersonCreator {

	private static boolean hasCOVID19;
	private static boolean hasEnemies;
	private static boolean isFrail;
	private static boolean belivesInChemtrails;

	public static Person createPerson() {

		hasCOVID19 =  true;
		hasEnemies = true;
		isFrail = true;
		belivesInChemtrails = true;
		
		Random randomNum = new Random();
		
		hasCOVID19 = randomNum.nextInt(2)==1 ? true : false;
		hasEnemies = randomNum.nextInt(2)==1 ? true : false;
		isFrail = randomNum.nextInt(2)==1 ? true : false;
		belivesInChemtrails = randomNum.nextInt(2)==1 ? true : false;


		Person person = new Person();
		person.setCovid19Status(hasCOVID19);
		person.setHasEnemies(hasEnemies);
		person.setFrail(isFrail);
		person.setBelievesInChemtrails(belivesInChemtrails);
		
		person.isAnxiou();

		return person;
	}


}
