package com.hervey.app;

public class Person {
	
	public Person() {
		
	}
	
	
	boolean Covid19Status;

	public boolean isAnxiou() {
		if(Covid19Status) {
			return true;
		}
		return false;
	}

	public boolean isCovid19Status() {
		return Covid19Status;
	}

	public void setCovid19Status(boolean covid19Status) {
		Covid19Status = covid19Status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Covid19Status ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Covid19Status != other.Covid19Status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [Covid19Status=" + Covid19Status + "]";
	}
	
	
	

}
