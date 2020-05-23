package com.hervey.app;
//simulates class calling for UI to open up user entering data to determine anxiety of that person

public class AnxietyChecker {

	public static void main(String[] args) {

		Person standardPerson = PersonCreator.createPerson();
		//standardPerson has an instance variable saying whether anxious or not, then we can output/user as simulated with syso		
		System.out.println("Anxiety status of standard person is:  " + standardPerson.isAnxiou());

	}

}
