package com.hervey.app;

public class AnxietyChecker {

	public AnxietyChecker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person =new Person();
		
		person.setCovid19Status(true);
		
		boolean answer = person.isAnxiou();
		
		System.out.println("Anxiety excess is:  " + answer);
		PersonCreator.createPerson();
		
		
		

	}

}
