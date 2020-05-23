package com.hervey.app;
//simulates class calling for UI to open up user entering data to determin anxiety of that person

public class AnxietyChecker {

	public AnxietyChecker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person =new Person();
		
		person.setCovid19Status(true);
		
		boolean answer = person.isAnxiou();
		
		System.out.println("Anxiety status of generic person is:  " + answer);
		Person fatperson = PersonCreator.createPerson();
		
		System.out.println("Anxiety status of fatperson is:  " + fatperson.isAnxiou());
		
		
		//fatPerson has an instance variable saying whether anxious or not, then we can output/user as simulated with syso
		
		
		

	}

}
