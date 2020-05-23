package com.hervey.app;
//simulates class calling for UI to open up user entering data to determin anxiety of that person

public class AnxietyChecker {

	public AnxietyChecker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		
		Person standardPerson = PersonCreator.createPerson();
		
		System.out.println("Anxiety status of standard is:  " + standardPerson.isAnxiou());
		
		
		//fatPerson has an instance variable saying whether anxious or not, then we can output/user as simulated with syso
		
		
		

	}

}
